import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int n=stdin.nextInt();
		int[] h=new int[n];
		for(int i=0;i<n;i++)
		 h[i]=stdin.nextInt();
		int cnt=0;
		for(int i=0;i<n-1;i++) {
			if(h[i]>h[i+1]) {
				h[i]=h[i]-1;
			}
		}

		for(int i=0;i<n-1;i++) {
			if(h[i]>h[i+1]) cnt++;
		}

		if(cnt==0) System.out.println("YES");
		else System.out.println("NO");

	}

}
