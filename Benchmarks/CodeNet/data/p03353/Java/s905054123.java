import java.util.*;
import java.util.stream.Collectors;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int K = sc.nextInt();

		List<String> subStrDblList = new ArrayList<>();

		for (int i=0; i<s.length(); i++) {
			for (int e=i+1; e<=s.length(); e++) {
				subStrDblList.add(s.substring(i,e));
			}
		}

		List<String> subStrList = subStrDblList.stream().distinct().collect(Collectors.toList());
		Collections.sort(subStrList);
		System.out.println(subStrList.get(K-1));
	}
}

