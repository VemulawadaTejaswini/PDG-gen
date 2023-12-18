import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int start = 1;
		while(k-1>0) {
			start += 2;
			k--;
		}
		if(start <= n) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
    }

}
