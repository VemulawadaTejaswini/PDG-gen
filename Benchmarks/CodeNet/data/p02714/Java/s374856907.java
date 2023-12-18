

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();scanner.nextLine();
		char[] ca = scanner.nextLine().toCharArray();
		int cnt = 0;
		for(int i = 0; i < ca.length - 2; i++){
			for(int j = i+1; j < ca.length - 1; j++){
				for(int k = j+1; k < ca.length; k++){
					if(j - i == k - j) continue;
					if(ca[i] != ca[j] && ca[i] != ca[k] && ca[j] != ca[k]) cnt++;
				}
			}
		}
		System.out.println(cnt);
		scanner.close();
	}

}
