import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		int ans = 0;
		for(int i = 0; i < 3; i++){
			if(S.charAt(i) == 'R'){
				ans++;
			}
			else if(ans == 1 && S.charAt(i) == 'S'){
				ans--;
			}
		}
		System.out.println(ans);

		stdIn.close();
	}
}