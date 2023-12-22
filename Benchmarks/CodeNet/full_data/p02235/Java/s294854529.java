import java.util.Scanner;

public class Main {

	public static int findLCS(String string1, String string2) {
		int strings[][] = new int[1 + string1.length()][1 + string2.length()];
		
		for(int i = 1; i <= string1.length(); i++) {
			for(int j = 1; j <= string2.length(); j++) {
				if(string1.charAt(i-1) == (string2.charAt(j-1))){
					strings[i][j] = strings[i-1][j-1] + 1;
				}else {
					strings[i][j] = max(strings[i-1][j], strings[i][j-1]);
				}
			}
		}
		
		return strings[string1.length()][string2.length()];
	}
	
	public static int max(int x, int y) {
		int maximum = 0;
		if(x > y) {
			maximum = x;
		}else {
			maximum = y;
		}
		return maximum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int timesToRun = sc.nextInt();
		
		for(int i = 0; i < timesToRun; i++) {
			String firstString = sc.next();
			String secondString = sc.next();
			System.out.println(findLCS(firstString, secondString));
		}
		
	}
}

