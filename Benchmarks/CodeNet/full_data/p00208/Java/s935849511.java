// 忌み数
import java.util.Scanner;

public class Main{
	
	long change(long n) {
		int[] digit = {0,1,2,3,5,7,8,9};
		long x = n;
		long temp = 0;
		long d = 1;
		while(x>=1) {
			temp += (digit[(int)(x%8)] * d);
			x /= 8;
			d *= 10;
		}
		return temp;
	}

    void main() {
       Scanner sc = new Scanner(System.in);
       
       while(true) {
    	   long n = sc.nextInt();
    	   if(n==0) break;
    	   System.out.println(change(n));
       }
    }

    public static void main(String[] args) {
        new Main().main();
    }
}
