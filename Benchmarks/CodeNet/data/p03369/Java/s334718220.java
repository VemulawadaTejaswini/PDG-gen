import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int result = 700;
		
		char[] c = s.toCharArray();
		
		for(int i = 0; i < 3; i ++) {
			if(c[i] == 'o') {
				result += 100;
			}
		}
		System.out.println(result);
	}
}


	