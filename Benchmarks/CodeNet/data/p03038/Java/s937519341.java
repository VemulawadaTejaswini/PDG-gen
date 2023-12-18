import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());;
		int m = Integer.parseInt(sc.next());;
		long[] array = new long[n];
		Long[][] bc = new Long[m][2];
		long sum=0;
		int count=0;

		for(int i=0;i<n;i++) {
			array[i]=Long.parseLong(sc.next());
		}
		Arrays.sort(array);

		for(int i=0;i<m;i++) {
			bc[i][0]=Long.parseLong(sc.next());
			bc[i][1]=Long.parseLong(sc.next());
		}
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
		}
		System.out.println(sum);
	}

}


