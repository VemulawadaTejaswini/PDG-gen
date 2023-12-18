import java.util.Scanner;
public class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int ans = 0;
		for(char a :str.toCharArray()){
			if(a == '1'){
				ans ++;
			}
		}
		System.out.println(ans);
	}
}