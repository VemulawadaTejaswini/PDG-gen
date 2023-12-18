package paiza;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//地点の数
		int T = sc.nextInt();	//基準気温
		int A = sc.nextInt();	//お姫様ご所望の気温
		int H = 0;				//標高
		int t = 0;				//温度計算用
		int c = Integer.MAX_VALUE;/* なにこれ */
		
		Map<Integer, Integer> m = new HashMap<>();
		
		for(int i = 1; i <= N; i++) {
			H = sc.nextInt();
			t = (int)(T - H * 0.006) - A;
			m.put(Math.abs(t), i);
			if(Math.abs(t) < c) {
				c = Math.abs(t);
			}
		}
		System.out.println(m.get(c));
	}

}