import java.io.PrintWriter;
import java.util.*;

public class Main{

	public static void main(String[] args){
		//入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s[] = new String[n];
		for(int i = 0; i < n; i++) s[i] = sc.nextLine();
		sc.close();

		//処理
		Map<String, Long> map = new HashMap<>(); 
		for(int i = 0; i < n; i++){
			char t[] = s[i].toCharArray();
			Arrays.sort(t);
			String str = String.valueOf(t);
			map.compute(str, (key, value) -> value == null ? 1 : value+1);
		}

		long ans = 0;
		for(long v : map.values()){
			ans += v * (v-1) / 2;
		}
		
		//出力
		PrintWriter out = new PrintWriter(System.out);
		out.println(ans);
		out.flush();
	}
}