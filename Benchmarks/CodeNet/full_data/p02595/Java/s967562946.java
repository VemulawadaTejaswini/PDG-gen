import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();//点の数
		int D = sc.nextInt();//距離
		//座標の取得
		int[] x =new int[N];
		int[] y =new int[N];
		for(int i=0;i<N;i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		//計算
		int check=0;
		double dis;
		for(int i=0;i<N;i++) {
			dis=Math.sqrt((double)x[i]*x[i]+(double)y[i]*y[i]);
			if(dis<=(double)D) {
				check++;
			}
		}
		System.out.println(check);
	}

}
