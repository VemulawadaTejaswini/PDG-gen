import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		boolean[] human = new boolean[n];
		for (int i = 0; i < k; i++) {
			int d = scan.nextInt();
			for(int j = 0; j < d; j++)
				human[scan.nextInt()-1] = true;
		}
		scan.close();
		
		int ans = 0;
		for(boolean b : human)
			if(!b) ans++;
		
		System.out.println(ans);
	}

}
