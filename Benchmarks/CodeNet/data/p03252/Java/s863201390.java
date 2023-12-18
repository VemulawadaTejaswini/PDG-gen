import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String S = sc.next();
		String T = sc.next();
		int flg = 0; 
		for(int i=0;i<S.length();i++){
			int matchS = S.substring(i+1,S.length()).indexOf(S.substring(i,i+1));
			int matchT = T.substring(i+1,T.length()).indexOf(T.substring(i,i+1));
			if(matchS != -1){
				
				if(!T.substring(i,i+1).equals(T.substring(i+1+matchS,i+1+matchS+1))){
					System.out.println("No");
					flg=1;
					break;
				}
			}
			if(matchT != -1){
				if(!S.substring(i,i+1).equals(S.substring(i+1+matchT,i+1+matchT+1))){
					System.out.println("No");
					flg=1;
					break;
				}
			}
		}
		if(flg==0){
			System.out.println("Yes");
		}
	}
}