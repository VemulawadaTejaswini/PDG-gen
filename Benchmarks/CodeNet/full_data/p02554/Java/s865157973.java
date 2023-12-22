import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        long N = sc.nextInt();
        long x;
        long y;
        long z;
        long w = 0;
        x=2*(N-1)*(N-2);
        y=1;
        z=1;
        
        for(int i=0;i<N-2;i++) {
        x=8*x;
        if(x>1000000007) {
        	x=x%1000000007;
        }
        }
        
        for(int i=0;i<N-2;i++) {
        z=8*z;
        y=10*y;
        if(y>1000000007) {
        	y=y%1000000007;
        }
        if(z>1000000007) {
        	z=z%1000000007;
        }
        w=Math.abs(y-z);
        }
        
        System.out.println(x+w);
        

    }
}