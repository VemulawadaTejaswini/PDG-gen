import java.util.Scanner;
public class Main {
  	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		int ans = Integer.parseInt(a+b);
		int i=(int)Math.sqrt(ans);
		if(i*i==ans){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
    }
}