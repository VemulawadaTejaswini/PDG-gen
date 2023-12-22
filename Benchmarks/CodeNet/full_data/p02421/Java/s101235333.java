import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String taro, hanako;
		int countT = 0, countH = 0;
		// int wordLength;
		for (int i = 0; i < n; i++) {
			taro = sc.next();
			hanako = sc.next();
			/*
			if(taro.length() >= hanako.length()){
				wordLength = taro.length();
			}else{
				wordLength = hanako.length();
			}
			for (int j = 0; j < wordLength; j++) {
				if (taro.charAt(j) > hanako.charAt(j)) {
					countT += 3;
					break;
				} else if (taro.charAt(j) < hanako.charAt(j)) {
					countH += 3;
					break;
				} else if (taro.length() - 1 == j || hanako.length() - 1 == j) {
					if (hanako.length() > taro.length()) {
						countH += 3;
						break;
					} else if (taro.length() > hanako.length()) {
						countT += 3;
						break;
					} else {
						countT++;
						countH++;
					}
				}
			}
			*/
			if(taro.compareTo(hanako) > 0){
				countT += 3;
			}else if(taro.compareTo(hanako) < 0){
				countH += 3;
			}else{
				countT++;
				countH++;
			}
		}
		System.out.println(countT + " " + countH);
		sc.close();
	}
}
