import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = (n-2)*180;
		System.out.println(ans);
		sc.close();
	} 
}
