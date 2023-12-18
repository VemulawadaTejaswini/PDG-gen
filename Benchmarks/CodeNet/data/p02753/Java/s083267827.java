import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans;
		
		if (s.equals("AAA") || s.equals("BBB")){
			ans="No";
		}else{
			ans="Yes";
		}

		System.out.println(ans);
		sc.close();
	}
}