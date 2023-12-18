import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String T = sc.nextLine();
		String str = "";
		outside : for(int i = 0; i <= S.length() - T.length(); i++) {
			StringBuilder sb = new StringBuilder(S);
			sb = sb.replace(i, i + T.length(), T);
			//System.out.println(sb);
			for(int j = 0; j < S.length(); j++) {
				if(!sb.substring(j, j + 1).equals("?")) {
					if(j >= i && j <= i + T.length()) {
						if(!S.substring(j, j + 1).equals("?")) {
							if(!sb.substring(j, j + 1).equals(S.substring(j, j + 1))) {
								continue outside;
							}
						}
						//System.out.println(sb.substring(j, j + 1)+":"+sb);
					}else if(S.substring(j, j + 1).equals(sb.substring(j, j + 1))) {
						//System.out.println(sb.substring(j, j + 1)+":"+sb);
					} else {
						//System.out.println(sb.substring(j, j + 1)+":"+"No");
						continue outside;
					}
				} else {
					sb.replace(j, j + 1, "a");
					//System.out.println(sb.substring(j, j + 1)+":"+sb);
				}
			}
			str = sb.toString();
		}
		if(str == "") {
			System.out.println("UNRESTORABLE");
		} else {
			System.out.println(str);
		}
	}
}
