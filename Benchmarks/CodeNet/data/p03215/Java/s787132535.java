import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println();
		int N=sc.nextInt();
		int K=sc.nextInt();
		long[] atai=new long[N+1];
		long[] wa=new long[N*(N+1)/2];
		atai[0]=0;
		for(int i=1; i<=N; i++) {
			atai[i]=sc.nextLong();
		}

		for(int i=1; i<=N; i++) {
			atai[i]=atai[i]+atai[i-1];		//累積和
		}
		int counter=0;
		for(int i=0; i<=N; i++) {
			for(int j=i; j<=N; j++) {
				if(i!=j) {
					wa[counter]=atai[j]-atai[i];
					counter++;
				}
			}
		}
		Arrays.sort(wa);
		long moto=wa[wa.length-1];
		//System.out.println(moto);
		int kai=0;
		for(int i=0; i<K-1; i++) {
			moto=moto&wa[wa.length-2-i];
			//System.out.println(wa[wa.length-2-i]);
			kai++;
		}
		System.out.println(moto);
	}
}