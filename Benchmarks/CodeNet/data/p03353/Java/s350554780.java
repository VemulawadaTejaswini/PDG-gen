import java.util.*;
import java.util.stream.Collectors;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int K = sc.nextInt();

		Set<String> set = new HashSet<String>();


		loop :for (int i=0; i<s.length(); i++) {
			for (int e=i+1; e<=s.length(); e++) {
				set.add(s.substring(i,e));
				if (set.size() > K) {
					break loop;
				}
			}
		}

		List<String> subStrDblList = new ArrayList<>(set);
		List<String> subStrList = subStrDblList.stream().distinct().collect(Collectors.toList());
		Collections.sort(subStrList);
		System.out.println(subStrList.get(K-1));
	}
}

