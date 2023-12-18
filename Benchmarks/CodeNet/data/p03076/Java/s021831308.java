import java.util.*;

public class Main {
	
	class DishDiff{
		int time;
		int diff;
		public DishDiff(int time, int diff){
			this.time = time;
			this.diff = diff;
		}
	}
	
	public int earliestFinalDish(int[] dishes){
		
		List<DishDiff> list = new ArrayList<>();
		
		for(int tmp : dishes){
			int diff = tmp % 10 == 0? 0 : (10 - (tmp % 10));
			list.add(new DishDiff(tmp, diff));
		}
		
		Collections.sort(list, new Comparator<DishDiff>() {
			@Override
			public int compare(DishDiff o1, DishDiff o2) {
				return o1.diff - o2.diff;
			}
		});
		
		int ans = 0;
		int len = list.size();
		for(int i = 0; i < len - 1; i++){
			DishDiff tmp = list.get(i);
			ans += tmp.diff + tmp.time;
		}
		
		ans += list.get(len - 1).time;
		
		return ans;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] dishes = new int[5];
		// get values for 5 antennas and val for k
		dishes[0] = sc.nextInt();
		dishes[1] = sc.nextInt();
		dishes[2] = sc.nextInt();
		dishes[3] = sc.nextInt();
		dishes[4] = sc.nextInt();
		
		Main bFiveDishes = new Main();
		
		System.out.println(bFiveDishes.earliestFinalDish(dishes));
	}
}