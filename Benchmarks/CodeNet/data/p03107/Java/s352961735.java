import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		ArrayList<Integer> foo = new ArrayList<>();
		for(int i=0;i<S.length();i++) {
			foo.add(Character.getNumericValue(S.charAt(i)));
		}

		int chCnt=1;
		int befNum=0;
		int cnt = 0;
		int removeCnt = 0;
		while(chCnt!=0) {
			chCnt=0;
			cnt =0;
			if(foo.size()!=0) {
				befNum=foo.get(0);
			}else {
				break;
			}
			for(int i=0;i<foo.size();i++) {
				if(befNum!=foo.get(i)) {
					foo.remove(cnt);
					foo.remove(cnt-1);
					chCnt++;
					removeCnt=removeCnt+2;
					break;
				}
				cnt++;
			}
		}
		System.out.println(removeCnt);
	}
}