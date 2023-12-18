import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean[] PIN = new boolean[1000];
		for(int i = 0; i< 1000; i++){
			PIN[i] = false;
		}

		String S = sc.next();
		char[] charS = S.toCharArray();
		int[] intS = new int[N];
		for(int i = 0; i < N; i++){
			intS[i] = Character.getNumericValue(charS[i]);
		}


		int PIN_num = 0;
		for(int i = 0; i < N; i++){
			for(int j = i+1; j < N; j ++){
				for(int k = j+1; k < N; k++){

					PIN_num = 100*intS[i]+ 10*intS[j] + intS[k];
					PIN[PIN_num] = true;
				}
			}
		}
		int cnt =0;

		for(int i = 0; i <1000; i++){
			if(PIN[i]){
				cnt++;
			}
		}

		System.out.print(cnt);
	}
}
