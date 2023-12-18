import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		String[] S = s.split("");
		String[] T = t.split("");
		String newStr = null;
		
		for(int i = 0; i < S.length; i++){
			if(i == 0){
				newStr = S[i] + T[i];
			}
			else if(i > 0){
				newStr += S[i];
				newStr += T[i];
			}
		}
		
		System.out.println(newStr);
	}
}
