import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	static long[] maxPas = new long[5];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long qty =  Long.parseLong(sc.nextLine());
		Map<Long, Integer> map = new HashMap<Long, Integer>();
		for(long i=0; i<qty; i++) {
			map.put(i, 0);
		}
		for(int i=0; i<5; i++) {
			 maxPas[i] = Long.parseLong(sc.nextLine());
		}
		int keika = 0;
		while(true) {
			keika ++;
			for(int i=4; i>-1; i--) {
				//右に移す
				int cnt = 0;
				for(long k=0; k<qty; k++) {
					if(map.get(k) == i) {
						map.put(k, i+1);
						cnt++;
						if(cnt == maxPas[i]) {
							break;
						}
					}
				}
			}
			boolean endFlg = true;
			for(long k=0; k<qty; k++) {
				if(map.get(k) != 5) {
					endFlg = false;
					break;
				}
			}
			if(endFlg) {
				break;
			}
		}
		System.out.println(keika);
	}
}