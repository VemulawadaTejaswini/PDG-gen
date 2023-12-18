import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		char[] ss = s.toCharArray();
		char[] tt = new char[s.length()];
		
		int i = 0;
		for(char c : ss) {
			if(c != 'B') {
				tt[i] = c;
				i++;
			} else if(i != 0){
				i--;
			}			
		}
		
		for(int j = 0; j < i; j++) {
			System.out.print(tt[j]);
		}
		System.out.println();

	}

}
