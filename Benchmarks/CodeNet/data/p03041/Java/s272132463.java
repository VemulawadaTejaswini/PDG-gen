import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			int N, K;
			char now;
			N = sc.nextInt();
			K = sc.nextInt();
			char[] charS = sc.next().toCharArray();
			
			now = charS[K - 1];
			if (now == 'A') {
				
				charS[K - 1] = 'a';
				
			} else if (now == 'B') {
				
				charS[K - 1] = 'b';
			
			} else if (now == 'C') {
				
				charS[K - 1] = 'c';
			}
			
			for (char c: charS){
				System.out.print(Character.toString(c));
			}
			System.out.println();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}