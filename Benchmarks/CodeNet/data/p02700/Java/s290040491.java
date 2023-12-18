import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int p = 0;
		while(a > 0 && c > 0){
			if(p == 0)
				c -= b;
			else
				a -= d;
			p = 1 - p;
		}
		System.out.println((a > 0)?"Yes":"No");
		
		sc.close();
    }
}