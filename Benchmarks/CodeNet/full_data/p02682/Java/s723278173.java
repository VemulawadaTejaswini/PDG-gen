

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int K=sc.nextInt();
		int ans=0;

		int[] table=new int[K];

		for(int i=0; i<K; i++) {
			if(A>0) {
				table[i]=1;
				A--;
			}else if(B>0) {
				table[i]=0;
				B--;
			}else if(C>0) {
				table[i]=-1;
				C--;
			}

		}

		for(int i=0; i<K; i++) {
			ans=ans+table[i];
		}

		System.out.println(ans);

		sc.close();

	}
}
