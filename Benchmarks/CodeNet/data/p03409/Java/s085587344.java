import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer, Integer> red_x = new TreeMap<Integer, Integer>();
		Map<Integer, Integer> red_y = new TreeMap<Integer, Integer>();
		Map<Integer, Integer> blue_x = new TreeMap<Integer, Integer>();
		Map<Integer, Integer> blue_y = new TreeMap<Integer, Integer>();
		
		for(int i = 0; i < N; i++) {
			int temp_x = sc.nextInt();
			int temp_y = sc.nextInt();
			red_x.put(temp_x, temp_y);
			red_y.put(temp_y, temp_x);
		}
		
		for(int i = 0; i < N; i++) {
			int temp_x = sc.nextInt();
			int temp_y = sc.nextInt();
			blue_x.put(temp_x, temp_y);
			blue_y.put(temp_y, temp_x);
		}
		
		int cnt1 = 0;
		ArrayList<Integer> use_key1 = new ArrayList<Integer>();
		outside : for(int red_key : red_x.keySet()) {
			for(int blue_key : blue_x.keySet()) {
				if(red_key < blue_key && red_x.get(red_key) < blue_x.get(blue_key)) {
					if(!use_key1.contains(blue_key)) {
						cnt1++;
						use_key1.add(blue_key);
						continue outside;
					}
				}
			}
		}
		
		int cnt2 = 0;
		ArrayList<Integer> use_key2 = new ArrayList<Integer>();
		outside : for(int red_key : red_y.keySet()) {
			for(int blue_key : blue_y.keySet()) {
				if(red_key < blue_key && red_y.get(red_key) < blue_y.get(blue_key)) {
					if(!use_key2.contains(blue_key)) {
						cnt2++;
						use_key2.add(blue_key);
						continue outside;
					}
				}
			}
		}
		
		System.out.println(Math.max(cnt1, cnt2));
	}	
}
