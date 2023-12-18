import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String S = sc.next();
		while(!S.isEmpty()) {
			if(S.endsWith("dream") || S.endsWith("erase")) {
				S = (new StringBuilder(S)).substring(0, S.length() - 5).toString();
			}else if(S.endsWith("dreamer")) {
				S = (new StringBuilder(S)).substring(0, S.length() - 7).toString();
			}else if(S.endsWith("eraser")) {
				S = (new StringBuilder(S)).substring(0, S.length() - 6).toString();
			}else {
				break;
			}
		}
		System.out.println(S.isEmpty() ? "YES" : "NO");
	}
}