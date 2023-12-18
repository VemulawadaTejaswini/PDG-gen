import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		int ans = 0;
		for(int i = 0; i < S.length(); i++){
			if((i+1) % 2 == 1){
				if(S.charAt(i) == 'R' || S.charAt(i) == 'U' || S.charAt(i) == 'D'){

				}
				else{
					ans++;
				}
			}
			else{
				if(S.charAt(i) == 'L' || S.charAt(i) == 'U' || S.charAt(i) == 'D'){

				}
				else{
					ans++;
				}
			}
		}
		if(ans > 0){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
		}
		stdIn.close();
	}
}
