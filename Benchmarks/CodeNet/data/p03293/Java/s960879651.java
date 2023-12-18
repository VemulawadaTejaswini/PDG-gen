import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//B
		String S = sc.next();
		String T = sc.next();
		boolean flag = false;
		for(int i = 0; i < S.length();i++){
			if(S.equals(T)){
				flag = true;
				break;
			}
			S = S.substring(1,S.length())+S.substring(0,1);
		}
		if(flag)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
