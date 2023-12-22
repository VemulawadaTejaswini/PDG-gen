import java.util.*;
public class Main{

	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
			long a = sc.nextLong();
			long v = sc.nextLong();
			long b = sc.nextLong();
			long w = sc.nextLong();
			long t = sc.nextLong();
			long relv = v - w;
			while(a < b && t >= 0){
				if(a>=b) b+=w;
				else{
				a += v; b += w;
			}
				--t;
			}
			if(a==b) System.out.println("YES");
			else System.out.println("NO");
	}
}