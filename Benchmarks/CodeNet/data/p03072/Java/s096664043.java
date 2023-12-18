import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int tmp = 0; tmp < n; tmp++) {
			int hn = sc.nextInt();
			list.add(hn);
		}
		int result = 0;
		
		for(int tmp1 = 0; tmp1 < n; tmp1++) {
			int x = list.get(tmp1);
			boolean flag = false;
			for(int tmp2 = 0; tmp2 < tmp1; tmp2++) {
				if(x < list.get(tmp2)) {
					flag = true;
				}
			}
			if(!flag) {
				result += 1;
			}
		}
		
		System.out.println(result);
	}
}