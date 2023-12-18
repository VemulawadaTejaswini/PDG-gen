import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int x = stdin.nextInt();
		int y = stdin.nextInt();
		int z = stdin.nextInt();
		int k = stdin.nextInt();
		int cnt = 0;
		long X[] = new long[x];
		long Y[] = new long[y];
		long Z[] = new long[z];
		long S[] = new long[x*y*z];
		for(int a = 0;a<x;a++) {
			X[a]=stdin.nextLong();
		}
		for(int b = 0;b<y;b++) {
			Y[b]=stdin.nextLong();
		}
		for(int c = 0;c<z;c++) {
			Z[c]=stdin.nextLong();
		}
		for(int i = 0;i<x;i++) {
			for(int j = 0;j<y;j++) {
				for(int m = 0;m<z;m++) {
					S[cnt]=X[i]+Y[j]+Z[m];
					cnt++;
				}
			}
		}
		Arrays.sort(S);
		for(int i = 0;i<k;i++) {
			System.out.println(S[x*y*z-i-1]);
		}
		


	}

}
