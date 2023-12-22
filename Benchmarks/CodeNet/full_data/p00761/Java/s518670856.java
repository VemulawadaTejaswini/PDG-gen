import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int L;
	static String a0;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		a0 = sc.next();
		L = sc.nextInt();
		if(L == 0 && a0.equals("0"))return false;
		return true;
	}
	
	static void solve(){
		int posion = -1;
		int res = -1;
		int fromItoJ = -1;
		for(int i = a0.length(); i < L; i++){
			a0 += "0";
		}
		char[] array = a0.toCharArray();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put(a0, 0);
		for(int index = 1; ; index++){
			Arrays.sort(array);
			String m = String.valueOf(array);
			int min = Integer.parseInt(m);
			StringBuffer sb = new StringBuffer(m);
			int max = Integer.parseInt(sb.reverse().toString());
			String diff = Integer.toString(max-min);
			for(int i = diff.length(); i < L; i++){
				diff = "0" + diff;
			}
			if(map.containsKey(diff)){
				posion = map.get(diff);
				fromItoJ = index - posion;
				res = max - min;
				break;
			}
			map.put(diff, index);
			array = diff.toCharArray();
		}
		System.out.println(posion + " " + res + " " + fromItoJ);
	}
}