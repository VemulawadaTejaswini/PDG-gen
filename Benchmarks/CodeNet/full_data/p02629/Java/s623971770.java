import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String ans = "";
		while(n > 0){
			ans += (char)('a'+n%26 - 1);
			n /= 26;
		}
		for(int i = ans.length()-1;i >= 0; --i){
			System.out.print(ans.charAt(i));
		}



	}
}
