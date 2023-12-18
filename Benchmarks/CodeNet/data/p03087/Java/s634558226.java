import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		int Q=sc.nextInt();
		String str=sc.next();
		String check="AC";

		int[] ans=new int[Q];

		for(int q=0;q<Q;q++) {

			int start=sc.nextInt()-1;
			int end=sc.nextInt();

			String str2=str.substring(start, end);

			int count=0;
			int index=0;

			while(true) {

				index=str2.indexOf(check,index);

				if(index==-1) break;

				count++;

				if(index==str2.length()-2) break;

				index++;


			}

			ans[q]=count;

		}

		for(int q=0;q<Q;q++) System.out.println(ans[q]);

		sc.close();

	}

}
