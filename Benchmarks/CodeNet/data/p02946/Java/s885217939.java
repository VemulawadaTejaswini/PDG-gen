import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		Scanner sc = new Scanner(System.in);
		int k= sc.nextInt();
		int x=sc.nextInt();
	
		if(k==1) {
			System.out.print(x);
		}else {
			for(int i=0;i<k+k-1;i++) {
				int t=x-(k-1);
				System.out.print(t);
				t++;
			}
		}
		
	}
}