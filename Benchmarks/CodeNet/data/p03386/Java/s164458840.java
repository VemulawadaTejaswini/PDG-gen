import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int a= stdin.nextInt();
		int b =stdin.nextInt();
		int k= stdin.nextInt();
		if(b-a<=2*k) {
			for(int i = a;a<b;i++) {
				System.out.println(i);
				
			}
		}else {
			for(int i = a,c=0;c<k;i++) {
				System.out.println(i);
				c++;
			}
			for(int j = b-k+1,c=0;c<k;j++) {
				System.out.println(j);
				c++;
			}
		}

		

	}

}
