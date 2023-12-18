import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		int[] a=new int[N];
		long[] data=new long[1000000000];
		Arrays.fill(data,0);
		int i,A,cnt=0;;
		for(i=0;i<N;i++) {
			a[i]=sc.nextInt();
			A=a[i];
			data[A]++;
		}
		for(i=1;i<data.length;i++) {
			if(data[i]>0) {
				cnt+=data[i]-i;
			}
		}
		System.out.println(cnt);
	}
}
