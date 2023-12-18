import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String S = sc.nextLine();
		
		int sum = 0;
		
		// second challenge
		int R = 0;
		int G = 0;
		int B = 0;
		
		for(int i = 0 ; i < N; i ++) {
			char c = S.charAt(i);
			if(c == 'R') {
				R ++;
			}else if(c == 'G') {
				G ++;
			}else {
				B ++;
			}
		}
		
		sum = R * G * B;
		
		for(int i = 0; i < N - 2; i ++) {
			char first = S.charAt(i);
			for(int j = i + 1; j < N - 1; j ++) {
				if(first == S.charAt(j)) {
					continue;
				}
				char second = S.charAt(j);
				if((2 * j - i) < N && S.charAt(2 * j - i) != first && S.charAt(2 * j - i) != second) {
					sum --;
				}
			}
		}
		System.out.println(sum);
	}
}