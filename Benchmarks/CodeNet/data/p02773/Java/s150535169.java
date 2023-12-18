import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		Map<String,Integer> poll = new TreeMap<String,Integer>();

		String b = scan.next();
		poll.put(b,1);

		for(int i=1;i<n;i++) {
			String S = scan.next();

			//マップに指定した文字列が存在しないとき
			if(!poll.containsKey(S)) {

				//指定した文字列のキーと値をマップに関連付ける
				poll.put(S, 1);
				}else {
					//
					poll.replace(S,poll.get(S)+1);
				}
		}

		int S = 0;
		for(String k:poll.keySet()) {
			S = Math.max(S, poll.get(k));
		}

		for(String k:poll.keySet()) {
			if(S == poll.get(k)) {
				System.out.println(k);
			}
		}


		scan.close();

	}

}
