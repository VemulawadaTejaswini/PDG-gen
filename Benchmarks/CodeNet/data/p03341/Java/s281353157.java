import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		char[] S = sc.next().toCharArray();



		int w = 0;
		int e = 0;
		for(int i = 0; i < N; i++) {
			if(S[i] == 'W') w++;
			else if(S[i] == 'E') e++;
		}

		int min = 30000;
		int karimin = 0;
		for(int i = 0; i < N; i++) {

			if(i == 0) {
				if(S[i] == 'E') karimin = e-1;
				else karimin = e;
			}else {
				if(S[i-1] == 'W') karimin += 1;
				if(S[i] == 'E') karimin -= 1;
			}

			if(karimin < min) min = karimin;
		}

		System.out.println(min);

		sc.close();
	}

}
