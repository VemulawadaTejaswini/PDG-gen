import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, index, weight;
	static double BMI, hight;
	static Map<Integer, Double>map = new HashMap<Integer, Double>();
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		n = sc.nextInt();
		if( n == 0 ) return false;
		for(int i = 0; i < n; i++){
			index = sc.nextInt();
			hight = sc.nextInt() * 0.01;
			weight = sc.nextInt();
			BMI = weight / ( hight * hight );
			map.put( index, Math.abs(BMI - 22.0));
		}
		return true;

	}
	static void solve(){
		double value = Integer.MAX_VALUE;
		int res = 0;
		for(int i = 1; i <= 1000000; i++){
			if( map.containsKey(i) ){
				if( value > map.get(i) ){
					value = map.get(i);
					res = i;
				}
			}
		}
		System.out.println(res);
		map.clear();
	}
}