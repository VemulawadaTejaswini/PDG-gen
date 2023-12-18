import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int D=sc.nextInt();
		int X=sc.nextInt();
		int d=1;
		int sum=0;
		int c=0;
		int A[]=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			while(d<=D) {
				c++;
				d+=A[i];
			}
			d=1;
			sum+=c;
			c=0;
		}
		sum+=X;
		System.out.println(sum);
	}

}