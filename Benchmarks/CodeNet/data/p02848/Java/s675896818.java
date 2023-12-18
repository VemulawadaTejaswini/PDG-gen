import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String[] s =  sc.next().split("");
		
		for(int i = 0 ; i < s.length ;i++ ) {
			char c=s[i].charAt(0);
			int ans = (int)c + n;
			if(ans > 90 ) {
				ans = ans - 26;
			}
			System.out.println((char)ans);
		}
		
		
    
    }
}