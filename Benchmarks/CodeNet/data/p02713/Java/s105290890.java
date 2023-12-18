

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
//		Map<Integer[], Integer> resultMap = new HashMap<Integer[], Integer>();
		long result = 0l;
		for(int l = 1; l <= k; l++){
			for(int m = 1; m <= k; m++){
				for(int n = 1; n <= k; n++){
//					Integer[] array = new Integer[3];
//					array[2] = l;
//					array[1] = m;
//					array[0] = n;
					Integer[] array = {l,m,n};
					Arrays.sort(array);
					// もうやったか判定
//					System.out.println(array[2] + " " + array[1] + " " + array[0]);
//					if(resultMap.containsKey(array)){
//						System.out.println("past");
//						result += resultMap.get(array);
//					}else{
//						System.out.println("new");
//						int gcd = Math.min(gcd(array[0], array[2]), gcd(array[0], array[1]));
//						result += gcd;
//						resultMap.put(array, gcd);
//					}
					int[] ra = {gcd(array[0], array[1]), gcd(array[0], array[2]), gcd(array[1], array[2])};
					Arrays.sort(ra);
					result += ra[0];
//					System.out.println(array[2] + " " + array[1] + " " + array[0] + ": " +ra[0]);
				}
			}
		}
		System.out.println(result);
//		System.out.println(gcd(2,2));
//		System.out.println(gcd(5,7));
		scanner.close();
	}
	private static int gcd(int small, int big){
		if(small == 1) return 1;
		if(small == big) return small;
		int r = 0;
		while(small > 0){
			r = big % small;
			if(r == 0) return small;
			big = small;
			small = r;

		}
		return big;
	}

}
