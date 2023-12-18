import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int K = reader.nextInt();
		int[] arr = new int[26];

		String S = reader.next();
		for (int j = 0; j < S.length(); j++) {
			arr[(int)S.charAt(j) - 97]++;
		}

		for (int i = 1; i < K; i++) {
			S = reader.next();
			for (int j = 0; j < 26; j++) {
				if (arr[j] > 0) {
					int gap = arr[j] - countOf(S, (char) (j + 97));
					if (gap > 0) {
						arr[j] -= gap;
					}
				}

			}
		}

		String result = "";

		for (int j = 0; j < 26; j++) {
			for (int i = 0; i < arr[j]; i++) {
				result += (char) (j + 97);
			}
		}


		reader.close();
		System.out.print(result);
	}
	 static int countOf(String str, char target){
			int count = 0;

			for(char x: str.toCharArray()){
				if(x == target){
					count++;
				}
			}

			return count;
		}

}

