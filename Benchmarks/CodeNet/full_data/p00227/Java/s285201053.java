import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNextLine()) {
			int purchaceCnt = s.nextInt();
			int canPackCnt = s.nextInt();
			if(purchaceCnt==0 && canPackCnt==0)
				return;
			s.nextLine();
			String[] values = s.nextLine().split(" ");
			Integer[] value = new Integer[values.length];
			for(int i=0 ; i<values.length ; i++){
				value[i] = new Integer(values[i]);
			}
			System.out.println(solve(purchaceCnt, canPackCnt, value));
		}
	}

	public static int solve(int purchaceCnt, int canPackCnt, Integer[] values) {
		int value = 0;
		int cnt=0;
		if(purchaceCnt >= canPackCnt){//無料にできる場合
			Arrays.sort(values, Collections.reverseOrder());
			for(int i=0 ; i<purchaceCnt ; i++) {
				cnt++;
				if(cnt==canPackCnt) {
					cnt = 0;
				}else {
					value += values[i].intValue();
				}
			}
		}else{
			Arrays.sort(values);
			for(int i=0 ; i<purchaceCnt ; i++) {
				value += values[i].intValue();
			}
		}
		return value;
	}
}