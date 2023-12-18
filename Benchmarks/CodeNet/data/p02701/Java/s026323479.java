
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		List<String> listS = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			listS.add(s);
			s = null;
		}
		List<String> listSsec = new ArrayList<String>(new LinkedHashSet<>(listS));
		System.out.println(listSsec.size());
	}
}