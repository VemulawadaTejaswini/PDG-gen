import java.util.*;

public class Main{
	public static void main(String[] args) {
		new Main().run();
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in); 
		int n;
		n = sc.nextInt();
		while(n-->0){
			int x,y,z;
			x = sc.nextInt();
			y = sc.nextInt();
			z = sc.nextInt();
			
			int a,b,c;
			a = Math.min(x,Math.min(y,z));
			c = Math.max(x,Math.max(y,z));
			b = x+y+z-a-c;
			
			System.out.println(a*a+b*b==c*c?"YES":"NO");
		}
	}
}