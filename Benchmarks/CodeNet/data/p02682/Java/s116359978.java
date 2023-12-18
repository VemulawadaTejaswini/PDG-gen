import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A_cnt = sc.nextInt();
		int B_cnt = sc.nextInt();
		int C_cnt = sc.nextInt();
		int D_cnt = sc.nextInt();
		//初期値設定
		int A_1 = 1;
		int B_zero = 0;
		int C_mainas = -1;

		//入力されたデータを配列に代入しておく
		int[] data = new int[3];
		data[0] = 0; //A
		data[1] = 0; //B
		data[2] = 0; //C

		//最大値演算
		//数値が大きい順にカウントしていく
		//D回文繰り返す。
		for(int i = 0;D_cnt > 0 && A_cnt > 0 ; i++) {
			D_cnt--;
			A_cnt--;
			data[0]++;
		}
		for(int i = 0;D_cnt > 0 && B_cnt > 0 ; i++) {
			D_cnt--;
			B_cnt--;
			data[1]++;
		}
		for(int i = 0;D_cnt > 0 && C_cnt > 0 ; i++) {
			D_cnt--;
			C_cnt--;
			data[2]++;
		}
		int Total = A_1 * data[0] + B_zero * data[1] + C_mainas * data[2];
		System.out.println(Total);
		sc.close();
		 }
		}