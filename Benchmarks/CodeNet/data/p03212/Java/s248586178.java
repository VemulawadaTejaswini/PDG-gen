import java.util.*;
public class Main{
	//static HashSet<Long> dic = new HashSet<>();
	public static void main(String[] argv){
		run();
	}

	static void run(){
	
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		System.out.println(dfs(n, 0));
	}
	static int dfs(long n, long s){
		if(s>n){
			return 0;
		} else {
			int count = 0;
			String ss = String.valueOf(s);
			if(ss.contains("3") && ss.contains("5") &&ss.contains("7"))
				count++;
			count += dfs(n, s*10+3) + dfs(n, s*10+5) + dfs(n, s*10+7); 
			return count;
		}
	}
}