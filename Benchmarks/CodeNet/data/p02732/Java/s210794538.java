import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static int[] kaizyou;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] A = new int[N];
		Map<Integer, Integer> a_map = new HashMap<Integer, Integer>();
		kaizyou = new int[N];
		for(int i=0; i<N; i++) {
			kaizyou[i] = -1;
		}

		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
			if(a_map.containsKey(A[i])) {
				int n = a_map.get(A[i]) + 1;
				a_map.put(A[i], n);
			}else {
				a_map.put(A[i], 1);
			}
		}

		for(int k=0; k<N; k++) {
			int ans = 0;

			for(Map.Entry<Integer, Integer> entry : a_map.entrySet()){
			    int key = entry.getKey();
			    int value = entry.getValue();

			    if(key == A[k]) {
			    	value--;
			    }

			    if(value > 2)
			    	ans += cal_kaizyou(value) / (2 * cal_kaizyou(value-2));
			    else if(value == 2)
			    	ans ++;

			}

			System.out.println(ans);
		}

	}

	public static int cal_kaizyou(int i) {
		int ans;
		if(kaizyou[i-1] != -1) {
			ans = kaizyou[i-1];
		}
		else if(i == 1) {
			ans = 1;
			kaizyou[i-1] = ans;
		}
		else {
			ans = i * cal_kaizyou(i-1);
			kaizyou[i-1] = ans;
		}

		return ans;
	}

}

