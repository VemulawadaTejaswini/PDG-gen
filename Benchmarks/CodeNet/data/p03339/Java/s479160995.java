import java.util.Iterator;
import java.util.Scanner;
import java.util.HashSet;
public class Main {
	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//
//      int N = sc.nextInt();
//		String S = sc.next();
//
//		int cnt = N - 1;
//
//	    for(int i = 0; i < N; i++){
//	    	int wkcnt = 0;
//		    for(int j = 0; j < N; j++){
//		    	if (i > j){
//		    		if (S.charAt(j) == 'W'){
//		    			wkcnt++;
//		    		}
//		    	}else if (i < j){
//		    		if (S.charAt(j) == 'E'){
//		    			wkcnt++;
//		    		}
//		    	}
//		    }
//		    cnt = Math.min(cnt, wkcnt);
//	    }
//		System.out.println(cnt);
		// ↑↑↑ ＴＬＥでひっかかったソース ↑↑↑

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();

		int cntE = 0;

		// Eの件数をもとめる
		for(int i = 0; i < N; i++) {
			if(S.charAt(i) == 'E') cntE++; // Eの件数
		}

		int ans = cntE;
		for(int i = 0; i < N; i++){
			// Eは減算、Wは加算
			if(S.charAt(i) == 'E') cntE--;
			if(i > 0 && S.charAt(i - 1) == 'W') cntE++;
			ans = Math.min(ans, cntE);
		}
		System.out.println(ans);
	}
}