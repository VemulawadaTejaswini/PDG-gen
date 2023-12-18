import java.util.HashMap;
import java.util.Scanner;

class Main {
	int n;
	HashMap<Integer,Integer> map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}

	Main(Scanner sc) {
		n = sc.nextInt();
		map = new HashMap<Integer,Integer>(){
			{
				for(int i=-1;i<=1.0e+5+2;i++) put(i, 0);
			}
		};
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			map.replace(a, map.get(a)+1);
		}
	}

	void solve() {
		int max = Integer.MIN_VALUE;
		for(int x=0;x<=1.0e+5+1;x++){
			max = Math.max(max, map.get(x-1) + map.get(x) + map.get(x+1));
		}
		System.out.println(max);
	}
}
