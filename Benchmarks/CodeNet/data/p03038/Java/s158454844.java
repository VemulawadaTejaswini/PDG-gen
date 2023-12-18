import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] array = new long[n];
		Long[][] bc = new Long[m][2];
		long sum=0;
		int count=0;

		for(int i=0;i<n;i++) {
			array[i]=sc.nextLong();
		}
		Arrays.sort(array);

		for(int i=0;i<m;i++) {
			bc[i][0]=sc.nextLong();
			bc[i][1]=sc.nextLong();
		}
		//Arrays.sort(bc[0],Collections.reverseOrder());
		Arrays.sort(bc, (a, b) -> Long.compare(a[0], b[0]));

		for(int i=m-1;i>=0;i--) {
			for(int j=count;j<n;j++) {
				if(array[j]<bc[i][1]) {
					array[j] = bc[i][1];
					bc[i][0]--;
					count++;
				}
				if(bc[i][0]<1) {
					break;
				}
			}
		}
		for(long i:array) {
			sum+=i;
			//System.out.println(i);
		}
		System.out.println(sum);

	}
}


