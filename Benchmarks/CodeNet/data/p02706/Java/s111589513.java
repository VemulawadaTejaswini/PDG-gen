import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int m = 0;
		n = sc.nextInt();
		m = sc.nextInt();

		int total = 0;

        for (int i = 0; i < m; i++) {
        	total += sc.nextInt();
        }

        if(n - total > 0){
			System.out.println(n - total);
        }else{
        	System.out.println("-1");
        }
	}
}