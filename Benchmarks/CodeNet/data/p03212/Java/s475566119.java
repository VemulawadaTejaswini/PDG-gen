import java.util.Scanner;
public class Main {
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.next());
		System.out.println(dfs("0"));
	}

	public static int dfs(String s){
		if (Integer.parseInt(s) > n){
			return 0;
		}

		int ret = 0;
		if (s.contains("3") && s.contains("5") && s.contains("7")){
			ret = 1;
		}
		ret += dfs(s + "3");
		ret += dfs(s + "5");
		ret += dfs(s + "7");
		return ret;
	}
}