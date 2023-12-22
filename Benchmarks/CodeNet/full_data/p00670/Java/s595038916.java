import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> mList = new ArrayList<Integer>();
		int en, n;
		
		n = sc.nextInt();
		en = sc.nextInt();
		while(n != 0 || en != 0) {
			mList.clear();
			for(int i = 0; i < n; i++) {
				mList.add(sc.nextInt());
			}
			
			mList.sort(new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return o2 - o1;
				}
			});
			
			int count = 0;
			for(int i = 0; i < mList.size() - 1; i++) {
				for(int j = i + 1; j < mList.size(); j++) {
					if(mList.get(i) + mList.get(j) <= en) {
						break;
					}
					count++;
				}
			}
			
			System.out.println(count);
			
			n = sc.nextInt();
			en = sc.nextInt();
		}
	}
}