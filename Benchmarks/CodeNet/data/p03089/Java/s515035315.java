import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		for(int tmp = 0; tmp < n ; tmp++) {
			int s = sc.nextInt();
			list.add(s);
		}
		
		Collections.sort(list);
		
		StringBuilder result = new StringBuilder();
		int index = 1;
		boolean flag = false;
		for(Integer s : list) {
			if(s > index) {
				flag = true;
			}
			index++;
		}
		
		if(flag) {
			System.out.println(-1);
		}else {
			list.stream().forEach(System.out::println);
		}
		
	}
}