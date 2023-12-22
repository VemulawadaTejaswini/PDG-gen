import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		int d = sc.nextInt();
		ArrayList<float[]> array = new ArrayList<float[]>();

		// 整数の取得
		for (int i = 0; i < n - 1; i++) {
			float[] vals = new float[2];
			vals[0] = sc.nextInt();
			vals[1] = sc.nextInt();
			array.add(vals);
		}

		//計算
		int cnt = 0;
		int j = 0;

        while (array.size() > j) {
        	float[] vals = array.get(j);
			if(Math.sqrt((vals[0] * vals[0]) + (vals[1] * vals[1])) <= d){
				cnt++;
			}
			j++;
			vals = null;
        }

		System.out.println(cnt);

		sc.close();
	}
}