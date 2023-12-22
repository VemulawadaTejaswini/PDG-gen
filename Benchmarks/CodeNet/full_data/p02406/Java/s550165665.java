import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        call(n);
    }
    public static void call(int n){
        int i = 1;
        while(i<=n){
            int x = i;
             surplus(x,i);
            i++;
        }
        System.out.println();
    }
    public static void surplus(int i,int j){
        if(i%3==0 ) {
        	System.out.print(" "+j);
        }else {
        	while(i>=1) {
        	if(i%10 == 3) {
        		System.out.print(" "+j);
        		break;
        	}else i/=10;
        	}
        }
    }
}
