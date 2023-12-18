import java.util.*;
import java.lang.Math;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if (X > Y) {
        		int c = X;
        		X = Y;
        		Y = c;
        }
        if ((X+Y)%3 != 0) {
        		System.out.println(0);
        } else {
        		int z = (X+Y)/3;
        		if (z > X) {
        			System.out.println(0);
        		} else if (z == X) {
        			System.out.println(1);
        		} else {
        			int x = X-z;
        			long num = 1;
        			for(int i = 1; i <= x; i++){
        	            num = num * (z - i + 1) / i;
        	        }
        			long a = (long)Math.pow(10, 9)+7;
        			long b = num%a;
        			System.out.println(b);
        		}
        }
    }
}