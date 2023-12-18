import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		int answer = 0;
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int K = sc.nextInt();
		sc.close();
		String allStr = "";
		for(int i = 0; i<K; i++) {
			allStr = allStr + S;
		}
		String[] allStrArray = allStr.split("");

		int lineLength = S.length()*K;
		int sameCount = 0;
		for(int i = 0; i+1 < lineLength; i++) {
			if(allStrArray[i].equals(allStrArray[i+1])) {
				sameCount += 1;
			}else {
				answer += (sameCount+1)/2;
				sameCount = 0;
			}
		}
		answer += (sameCount+1)/2;

		System.out.println(answer);
	}
}
