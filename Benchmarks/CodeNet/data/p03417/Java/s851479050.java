import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		sc.close();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		//2で割り切れる場合を「表」割り切れない場合を「裏」と判断する
		for(long i = 1;i <= N * M;i++) {
			String s = String.valueOf(i);
			map.put(s, 0);
		}
		
		for(long k = 1;k <= N * M;k++) {
			String s1 = String.valueOf(k); //1 中央
			String s2 = String.valueOf(k + 1); //2 右
			String s3 = String.valueOf(k - 1); //3 左
			String s4 = String.valueOf(k - N); //4 上
			String s5 = String.valueOf(k - N + 1); //5 右上
			String s6 = String.valueOf(k - N - 1); //6 左上
			String s7 = String.valueOf(k + N); //7 下
			String s8 = String.valueOf(k + N + 1); //8　右下
			String s9 = String.valueOf(k + N - 1); //9 左下
			map.put(s1, map.get(s1) + 1);
			if(map.containsKey(s4)) map.put(s4, map.get(s4) + 1);
			if(map.containsKey(s7)) map.put(s7, map.get(s7) + 1);
			if(N != 1) { //　行が一列ではない場合
				if(k % N != 0) { // 258 中央になるのが最も右側ではない場合
					if(map.containsKey(s2)) map.put(s2, map.get(s2) + 1);
					if(map.containsKey(s5)) map.put(s5, map.get(s5) + 1);
					if(map.containsKey(s8)) map.put(s8, map.get(s8) + 1);
				}
				if(k % N != 1) { //369 中央になるのが最も左側ではない場合
					if(map.containsKey(s3)) map.put(s3, map.get(s3) + 1);
					if(map.containsKey(s6)) map.put(s6, map.get(s6) + 1);
					if(map.containsKey(s9)) map.put(s9, map.get(s9) + 1);
				}	
			}
		}
		
		long count = 0;
		for(String key: map.keySet()) {
			if(map.get(key) % 2 == 1) count++;
		}
		System.out.println(count);
	}

}