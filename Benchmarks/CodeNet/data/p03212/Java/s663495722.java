import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = String.valueOf(n);
		int len = str.length();
		
		List<String> list = new ArrayList<String>();
		dfs(list,"",len);
		int count = 0;
		for(int i=0; i<list.size(); i++) {
			if(Integer.parseInt(list.get(i))<=n) {
				count++;
			}
		}
		System.out.println(count);
	}

	private static void dfs(List<String> list, String res, int len) {
		if(res.length() == len+1) {
			return;
		}else {
			if(res.contains("7")&&res.contains("5")&&res.contains("3")) {
				list.add(res);
			}
			dfs(list, res + "7", len);
			dfs(list, res + "5", len);
			dfs(list, res + "3", len);
		}
	}
}
