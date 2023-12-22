import java.util.*;

class Main{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		nint();
		int q = nint();
		TreeMap<Integer,Integer> map = new TreeMap<>();
		map.put(-1, Integer.MAX_VALUE);
		while (q-- > 0) {
			int command = nint();
			if (command == 0) {
				int s = nint();
				int t = nint();
				int x = nint();
				int rightValue = map.floorEntry(t+1).getValue();
				map.subMap(s, t+1).clear();
				map.put(s,x);
				map.put(t+1,rightValue); 
			} else {
				int i = nint();
				System.out.println(map.floorEntry(i).getValue());
			}
		}
	}
	
	static int nint(){
		return Integer.parseInt(sc.next());
	}
	
}
