import java.util.*;
public class Main{
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int flag = 0;
        while(true) {
        	if(a <= 0 || c <= 0) {
        		break;
        	}else {
        		if(flag == 0) {
        			c -= b;
        			flag = 1;
        		}else {
        			a -= d;
        			flag = 0;
        		}
        	}
        }
        if(a > 0) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
	}
}