import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		
			int q = sc.nextInt();
			calc(q);
			
		
	}
	public void calc(int q){
		int sum = 0;
		for(int i = 0; i < q; i++){
			int p = sc.nextInt();
			String c = sc.next();
			int n = sc.nextInt();
			
			for(int j = 0; j < n; j++){
				if(c.equals("(")) sum++;
				if(c.equals(")")) sum--;
			}
			if(sum == 0) System.out.println("Yes");
			else System.out.println("No");
		}
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}