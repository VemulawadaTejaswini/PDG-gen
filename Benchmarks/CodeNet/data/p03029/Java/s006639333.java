import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int p = sc.nextInt();
		int ans = (a*3+p)/2;
		System.out.println(ans);
		sc.close();
	}
	
    
}
