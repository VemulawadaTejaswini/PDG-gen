import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] hoge =new int[N];

		for (int i=0; i<N; i++) {
			hoge[i] = scan.nextInt();
		}


		//seisuuka?
		int[] hoge2 = new int[N];
		boolean b = true;
		int count = 0;
		while(b) {

			for(int i = 0; i<N; i++) {
				if((hoge[i]%2)!=0) {
					b = false;
					break;
				}
				hoge2[i] = hoge[i]/2;
				if (i==N-1) {
					hoge = hoge2;
					count = count +1;
				}


			}

		}
		System.out.println(count);


	}

}
