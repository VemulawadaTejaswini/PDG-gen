import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt()-1;
		int[] c = new int[n];
		int[] s = new int[n];
		int[] f = new int[n];
		for(int i=0;i<n;i++) {
			c[i] = in.nextInt();
			s[i] = in.nextInt();
			f[i] = in.nextInt();
		}
		
		int[] time = new int[n+1];
		for(int i=0;i<n;i++) {
			time[i] = c[i] + s[i];
			for(int j=i+1;j<n;j++) {
				if(time[i]<s[j]) {
					time[i] = s[j] + c[j];
				}else {
					time[i] += (f[j]-time[i]%f[j]) + c[j];
				}
			}
		}
		for(int i=0;i<=n;i++) {
			System.out.println(time[i]);
		}
		in.close();
	}

}
