import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();

		String[] strS = new String[S.length()];
		String[] strT = new String[T.length()];
		for (int i = 0; i < S.length(); i++) {
			strS[i] = String.valueOf(S.charAt(i));
			strT[i] = String.valueOf(T.charAt(i));
		}
		
		String chnS,chnT="";

		for(int i=0;i<S.length();i++) {
			
			//i文字目を比較
			if(strS[i].equals(strT[i])) {
				//同じ場合、次の文字へ
				continue;
			}else {
				chnS=strS[i];
				chnT=strT[i];
				
				for(int j=0;j<S.length();j++) {
					if(strS[j].equals(chnS)) {
						strS[j]=chnT;
					}
				}
			}
		}
		if(Arrays.equals(strS, strT)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}
}