import java.util.*;
public class Main{
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        while(true) {
        	if(a <= 0 || c <= 0) {
        		break;
        	}else {
        		c -= b;
        		a -= d;
        	}
        }
        if(a <= 0) {
        	System.out.println("no");
        }else {
        	System.out.println("yes");
        }
	}
}