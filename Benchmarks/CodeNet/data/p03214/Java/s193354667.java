import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] sm=new int[N];
		int sum=0;
		for(int i=0; i<N; i++) {
			sm[i]=sc.nextInt();
			sum+=sm[i];
			sm[i]*=N;
		}
		Arrays.sort(sm);
		int dif_min=Integer.MAX_VALUE;
		int banme=0;
		for(int i=0; i<N; i++) {
			if(dif_min>Math.abs(sm[i]-sum)) {
				dif_min=Math.abs(sm[i]-sum);
				banme=i;
			}
		}
		System.out.println(banme);
	}
}