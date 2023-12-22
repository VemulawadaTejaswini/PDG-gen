import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		PrintWriter out = new PrintWriter(System.out);
		Map <String, String> map = new HashMap<>();
		while(sc.hasNext()){
			int m = sc.nextInt();
			for (int i = 0; i < m ; i++ ){
				map.put(sc.next(), sc.next());
			}
			int n = sc.nextInt();
			
			String ans = "";	
			for(int i = 0 ; i < n ; i++){
				ans = sc.next();
				if(map.get(ans) == null){			
					out.print(ans);
				}else{
					out.print(map.get(ans));
				}
			}
			out.println();
			out.flush();

		}
	}

}