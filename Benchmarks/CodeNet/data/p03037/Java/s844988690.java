import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		int M=sc.nextInt();

		int Start=sc.nextInt();
		int Last=sc.nextInt();

		for(int i=0;i<M-1;i++){
			int s=sc.nextInt();
			int l=sc.nextInt();

			if(s>Start && Last>=s) Start=s;
			if(Last>l && Start<=l) Last=l;


		}

		System.out.println((Last-Start)+1);
		sc.close();
	}

}
