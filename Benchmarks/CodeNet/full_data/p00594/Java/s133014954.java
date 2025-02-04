import java.util.HashMap;
import java.util.Scanner;

class Main{

	static Scanner scanner = new Scanner(System.in);
	static HashMap<Integer, Integer> map;

	public static void main(String args[]){

		while(true){
			int n = scanner.nextInt();
			map = new HashMap<Integer, Integer>();
			if(n == 0) break;
			System.out.println(solve(n));
		}
	}

	static String solve(int n){
		int i = 0;
		Integer m;
		Integer num;
		for(; i < n/2; i++){
			m = scanner.nextInt();
			num = map.get(m);
			if(num != null){
				num++;
				map.put(m, num);
			}else{
				map.put(m, 1);
			}
			if(i % 50000 == 0) System.gc();
		}

		String result = "NO COLOR";
		for(; i < n; i++){
			m = scanner.nextInt();
			num = map.get(m);
			if(num != null){
				num++;
				if(num > n/2){
					result = "" + m;
				}
				map.put(m, num);
			}
			if(i % 50000 == 0) System.gc();
		}
		return result;
	}
}