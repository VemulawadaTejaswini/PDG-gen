import java.util.Scanner;

class Main{
	//この問題の気持ち的にXORする数字（A_1からA_Nまでの数字）の各桁のビットを見ておき、その立っているか/立っていないかの数を調べていけばよさそう
	//XOR　は　11->0 10->1 01->1 00->0
	static int[] bits=new int[63];
	public static void main(String[] args) {
		for(int i=0; i<63; i++) {
			bits[i]=0;
		}
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long K=sc.nextLong();
		//オーバーフローに注意
		long[] uketori=new long[N];
		for(int i=0; i<N; i++) {
			uketori[i]=sc.nextLong();
			calcbit(uketori[i]);
		}
		long[] suji=new long[62];
		suji[0]=1;
		for(int i=1; i<62; i++) {
			suji[i]=suji[i-1]*2;
		}
		long ans=0;
		for(int i=61; i>=0; i--) {
			if(bits[i]*2>N) {		//XORする数字それぞれを見ていって、ビットが半分以上たっていないなら解のビットを立たせない
									//立っているものと立っていないものが同数のときは立たせないほうが値が小さくなり、より制限に適応できる
			}
			else if(bits[i]*2<=N) {
				if(ans+suji[i]<=K) {
					ans+=suji[i];
				}
			}
		}
		long output=0;

		for(int i=0; i<N; i++) {
			output+=(ans^uketori[i]);
		}
		pl(output);
	}
	public static void calcbit(long tmp) {
		long a=tmp;
		int counter=0;
		while(a>0) {
			if(a%2==1) {
				bits[counter]++;
			}
			counter++;
			a/=2;
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}