import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		
		int count = 0;
		while(x - list.get(count) >= 0) {
			x = x - list.get(count);
			count++;
			if(count == n) {
				if(x != 0) {
					count--;
				}
				break;
			}
		}
		
		System.out.println(count);
	}
	
}
