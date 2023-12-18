import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//B
		String S = sc.next();
		boolean flag = true;
		int c_count = 1;
		if(S.charAt(0) != 'A') flag = false;;
		if(S.charAt(1) == 'C') flag = false;
		for(int i = S.length()-4 ; i < S.length(); i++){
			if(S.charAt(i) == 'C'){
				c_count++;
			}
		}
		if(c_count != 1)flag = false;
		if(flag)
			System.out.println("AC");
		else
			System.out.println("WA");
	}
}
