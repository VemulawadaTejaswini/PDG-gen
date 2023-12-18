import java.util.*;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		
		String[] s = S.split("");

		// 白黒黒....
		int wbCnt= 0;
		if(s[0].equals("#")){
			wbCnt++;
		}
		
		for(int i=1; i<N; i++){
			if(s[i].equals(".")){
				wbCnt++;
			}
		}
		
		//黒黒....
		int bCnt=0;
		for(int i=1; i<N; i++){
			if(s[i].equals(".")){
				bCnt++;
			}
		}
		
		//白白...
		int wCnt=0;
		for(int i=1; i<N; i++){
			if(s[i].equals("#")){
				wCnt++;
			}
		}
		
		System.out.println(Math.min(Math.min(wbCnt, bCnt), wCnt));
	}


}
