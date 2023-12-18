import java.util.*;
public class Main{
	static String CardGame(String[] s){
		int len = 0;
		for(int i=0; i<3; i++){
			len += s[i].length();
		}
		int turn = 0;
		int next = 0;
		for(int i=0; i<len; i++){
			if(s[turn].length()==0){
				if(turn==0){
					return "A";
				}
				else if(turn==1){
					return "B";
				}
				else {
					return "C";
				}
			}

			else {
				if(s[turn].charAt(0)=='a'){
					next=0;
				}
				else if(s[turn].charAt(0)=='b'){
					next=1;
				}
				else {
					next=2;
				}
				s[turn] = s[turn].substring(1);
				turn = next;
			}
		}
		return "";
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] S = new String[3];
		for(int i=0; i<3; i++){
			S[i] = sc.next();
		}
		System.out.println(CardGame(S));
	}
}