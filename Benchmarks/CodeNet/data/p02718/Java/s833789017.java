import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n=s.nextInt(), m=s.nextInt();
		int[] a = new int[n];
		int cnt=0,sum=0;;
		for(int i=0; i<n; i++) {
			a[i] = s.nextInt();
			sum+=a[i];
		}
		int f = sum/(4*m);
		for(int i=0; i<n; i++) {
			if(a[i]>=f)cnt++;
		}
		if(cnt>=m) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}


}
