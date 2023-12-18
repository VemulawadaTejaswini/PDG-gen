import java.util.*;

public class Main {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in);){
			long N = Long.parseLong(scan.next());
			List<Long> list = new ArrayList<Long>();
			for(int i=0;i<5;i++) {
				list.add(Long.parseLong(scan.next()));
			}
			Collections.sort(list);
			long min = N / list.get(0) + 1;
			long ans = min + 4;
			System.out.println(ans);
		}
	}
}