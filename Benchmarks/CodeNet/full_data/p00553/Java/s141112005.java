import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			int ans = 0;
			if(a<0) {
				ans = d + Math.abs(a)*c + b*e;
			}
			else {
				if(a==0)
					ans += d;
				ans += (b-a)*e;
			}
			System.out.println(ans);
	  }	 
	}
}
