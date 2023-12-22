import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        	double[] point = new double[8];
        	for(int i = 0;i < 8;i++){
        		point[i] = scan.nextDouble();
        	}
        	double a = (point[0] - point[2])*(point[4] - point[6]);;
        	double b = -(point[1] - point[3])*(point[5] - point[7]);
        	if(a == b){
        		System.out.println("YES");
        	}else{
        		System.out.println("NO");
        	}
        }
    }
}