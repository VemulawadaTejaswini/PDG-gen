import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int l[]=new int[N];
		int r[]=new int [N];
		for(int i=0;i<N;i++) {
			l[i]=sc.nextInt();
			r[i]=sc.nextInt();
		}
		
		int c=0;
		
		for(int i=0;i<N;i++) {
			c+=r[i]-l[i]+1;
		}
		
		System.out.println(c);
		
	}
}
