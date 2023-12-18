import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		char[] S = sc.next().toCharArray();

		sc.close();

		int min = 0;
		for(int i = 1; i < N; i++) {
			if(S[i] == 'E') min++;
		}

		int karimin = min;
		for(int i = 1; i < N; i++) {
			if(S[i-1] == 'W' && S[i] == 'W') karimin +=1;
			if(S[i-1] == 'E' && S[i] == 'E') karimin -=1;
			
			if(karimin < min) min = karimin;
		}

		System.out.println(min);
	}

}
