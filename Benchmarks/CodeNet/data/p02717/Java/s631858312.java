import java.util.Scanner;

public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);


			//配列に入力値代入
			//別の配列に代入

			//配列に格納
			int num[] = new int[3];

			for(int i =0;i< 3;i++) {
				num[i] = sc.nextInt();
			}

			int num2[] = new int[3];

			num2[0] = num[2];
			num2[1] = num[0];
			num2[2] = num[1];

			for(int i =0;i<3;i++) {
				System.out.print(num2[i]+" ");
			}




		}
}

