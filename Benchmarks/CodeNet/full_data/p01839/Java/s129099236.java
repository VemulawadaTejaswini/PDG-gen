
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int f=0;
		int ans=0;
		n=sc.nextInt();
		String test;
		String A = "A";
		String Un = "Un";
		for(int i=0;i<n;i++) {
			test=sc.next();
			if(test.equals(A))ans++;
			else if(test.equals(Un))ans--;


			if(ans<0) {
				f=1;
				break;
			}
		}

		if(f==1)System.out.println("NO");
		else System.out.println("YES");

		sc.close();
	}
}

