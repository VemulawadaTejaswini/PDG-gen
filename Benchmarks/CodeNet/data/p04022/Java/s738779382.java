import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] S = new int[N+1];
		S[0] = -1;
		for(int i = 1; i <= N; i++) {
			S[i] = Integer.parseInt(sc.next());
		}

		boolean[] enableFlag = new boolean[N+1];
		for(int i = 1; i < enableFlag.length; i++) {
			enableFlag[i] = true;
		}

		boolean oneFlag = false;
		ArrayList<Integer> index = new ArrayList<Integer>();
		for(int i = 1; i < S.length-1; i++) {
			if(S[i] == 1) {
				oneFlag = true;
				index.add(i);
				break;
			}
		}

		for(int i = 1; i < S.length-1; i++) {
			if(enableFlag[i] == false) continue;
			for(int j = 2; j < S.length; j++) {
				if(enableFlag[j] == false) continue;
				if((S[i] == S[j]*S[j]) || (S[j] == S[i]*S[i])) {
					if(S[i] < S[j]) {
						enableFlag[j] = false;
					}else {
						enableFlag[i] = false;
					}
					break;
				}
			}
		}

		if(oneFlag) {
			for(int i = 1; i < S.length; i++) {
				if(enableFlag[i] == false) continue;
				if(isNumber(Math.cbrt(S[i])+"") && S[i] != 1) {
					enableFlag[i] = false;
				}
			}
		}

		int result = 0;
		for(int i = 1; i < enableFlag.length; i++) {
			if(enableFlag[i]) result++;
		}

		System.out.println(result);
	}

	public static boolean isNumber(String num) {
	    try {
	        Integer.parseInt(num);
	        return true;
	        } catch (NumberFormatException e) {
	        return false;
	    }
	}

}
