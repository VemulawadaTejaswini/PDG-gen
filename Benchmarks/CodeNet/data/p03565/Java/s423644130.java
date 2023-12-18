import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String Sd = in.next();
		String T = in.next();
		int S = Sd.length();
		String ans = "UNRESTORABLE";
		for(int i = 0; i < S-T.length()+1; i++){
			for(int j = 0; j < T.length(); j++){
				if(!(( Sd.charAt(i+j) == T.charAt(j) ) || Sd.charAt(i+j) == '?'))break;
				if(j == T.length()-1){
					ans = Sd.substring(0,i)+T+Sd.substring(i+j+1);
					ans = ans.replace('?','a');
				}
			}
		}
		System.out.println(ans);
	}
}