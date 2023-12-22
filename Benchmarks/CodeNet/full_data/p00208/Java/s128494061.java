
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	static int[] room = {0,1,2,3,5,7,8,9};
	static void r(int n) {
		if(n>=8) {
			r(n/8);
		}
		System.out.print(room[n%8]);
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        while(true) {
        	int n = sc.nextInt();
        	if(n == 0)break;
        	r(n);
        	System.out.println();
        }
    }
    
}

