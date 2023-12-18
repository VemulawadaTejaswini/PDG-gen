
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		Map<Long, Long> map = new TreeMap<Long, Long>();
		Main main = new Main();

		if (X >= 1 ||X <= 3) {
			System.out.println(X);
		}else {
			for (int i = X; i > 0; i--) {
				map.clear();
				main.factoring(map, i);
				long sum = 0;
				for (Long l : map.keySet()) {
					sum+= map.get(l);
				}

				if (map.size() == 1 && sum >= 2) {
					System.out.println(i);
					break;
				}
			}
		}





	}

	//Mapに渡すのでMain側で用意
	public void factoring(Map<Long, Long> factorMap, long num) {
		boolean isFactoringFlg = false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				if (factorMap.containsKey((long) i)) {
					factorMap.put((long) i, factorMap.get((long) i) + 1L);
				} else {
					factorMap.put((long) i, 1L);
				}
				num = num / i;
				isFactoringFlg = true;
				break;
			}
		}

		if (isFactoringFlg) {
			factoring(factorMap, num);
		} else {
			if (factorMap.containsKey(num)) {
				factorMap.put(num, factorMap.get(num) + 1L);
			} else {
				factorMap.put(num, 1L);
			}
		}
	}


}