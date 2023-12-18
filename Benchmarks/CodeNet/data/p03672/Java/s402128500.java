import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		char[] moji = stdIn.next().toCharArray();
		int cnt =moji.length;
		int ans = 1;
	Outer:	for(int i = cnt-2; i >= 1; i--) {
			if(i % 2 == 0) {
				continue;
			}
			for(int j = 0; j <= i/2; j++) {
				if(moji[j]!=moji[j+1+i/2]) {
					continue Outer;
				}
			}
			ans = i+1;
			break;
			
			
		}
		
		System.out.println(ans);
		
		
		
		
		
		
		
	}

}
