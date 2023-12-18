import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long answer = 0;

		try {
			//数取得
			int N = sc.nextInt();
			Map<Character, Integer> marchList = new HashMap<>();
			marchList.put('M', 0);
			marchList.put('A', 0);
			marchList.put('R', 0);
			marchList.put('C', 0);
			marchList.put('H', 0);
			for(int i = 0; i < N; i++) {
				String S = sc.next();
				char sHead = S.charAt(0);
				if(marchList.containsKey(sHead)) {
					int count = marchList.get(sHead);
					count++;
					marchList.replace(sHead, count);
				}
			}


			char[] marList = {'M','A','R','C','H'};

			for(int a1 = 0; a1 < marList.length-2; a1++) {
				for(int a2 = a1 + 1; a2 < marList.length -1; a2++) {
					for(int a3 = a2 + 1; a3 < marList.length; a3++) {
						answer += (marchList.get(marList[a1]) * marchList.get(marList[a2]) * marchList.get(marList[a3]));
					}
				}
			}

		}finally {
			sc.close();
			System.out.println(answer);
		}
	}

}
