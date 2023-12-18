import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();

		int array[][] = new int[Q][3];
		for(int i=0;i<Q;i++) {
			 for(int j=0;j<3;j++) {
				 array[i][j] = sc.nextInt();
			 }
		}
		 for(int i=0;i<Q;i++) {
			 int num = array[i][0];
			 int ans = num;
			 for(int j=2;j<array[i][2] + 1;j++) {
				 num += array[i][1];

				 System.out.println(num);
				 ans *= num ;

			 }
			 System.out.println(ans % 1000003);
			 num = 0;
		 }
		 sc.close();

	}
}
