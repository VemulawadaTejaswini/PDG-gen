import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //input
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        boolean[] b_ar = new boolean[N];

        for(int i=0;i<N;i++){
        	b_ar[i] = IsRightTriangle(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        }

        //output
        for(boolean b:b_ar){
        	if   (b) { System.out.println("YES");}
        	else     { System.out.println("NO"); }
        }
    }

    private static boolean IsRightTriangle(double a,double b,double c){
    	if( Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2) ||
            Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2) ||
            Math.pow(c,2) + Math.pow(a,2) == Math.pow(b,2)    ){
    		return true;
    	}else {
    		return false;
    	}
    }
}