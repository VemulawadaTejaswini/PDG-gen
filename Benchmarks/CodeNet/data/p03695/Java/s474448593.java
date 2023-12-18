

import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] iro=new int[8];
		int tourist=0;

		int N=sc.nextInt();

		for(int i=0; i<8; i++) {
			iro[i]=0;
		}
		int tmp=0;
		for(int i=0; i<N; i++) {
			tmp=sc.nextInt();
			if(tmp<3200) { iro[tmp/400]++;}
			else {
				tourist++;
			}
		}

		int clr=0;

		for(int i=0; i<8; i++) {
			if(iro[i]>0) {
				clr++;
			}
		}

		System.out.println(Math.max(1, clr)+" "+(clr+tourist));

	}
}