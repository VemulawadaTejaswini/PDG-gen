

import java.util.Scanner;

class Main{
	public static void main(String[] ag) {
		Scanner sc=new Scanner(System.in);
		int Qs=sc.nextInt();
		int[] times=new int[Qs];
		int wa=0;
		for(int i=0; i<Qs; i++) {
			times[i]=sc.nextInt();
			wa+=times[i];
		}
		int M=sc.nextInt();
		for(int i=0; i<M; i++) {
			int a=sc.nextInt();
			System.out.println(wa-times[a-1]+sc.nextInt());
		}
	}
}