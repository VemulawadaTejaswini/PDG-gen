import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");

		//コード
		//    	Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long ans = 0;
		for (int i = 1; i <= N; i++) {
			ans = ans + i * numOfDivisor(i);
		}
		System.out.println(ans);
	}

	static long numOfDivisor(int num) {
		if(num==1)return 0;

		int x = num;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		while(x>1) {
			for (int i=2;i<=x;i++) {
				if(x%i==0) {
				    if (map.containsKey(i)) {
				        map.put(i, map.get(i) + 1);
				    } else {
				        map.put(i,1);
				    }
					x=x/i;
				    break;
				}
			}
		}
		long ans = 1;
		for(int i:map.keySet()) {
			ans = ans * (map.get(i)+1);
		}
		return ans;
	}
}
