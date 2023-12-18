import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		int changeMin = n;

		for (int i=0; i<n; i++){
			int change = 0;
			String left;
			String right;
			if (i == 0){
				left = "";
				right = s.substring(1, n);
			} else if (i == (n-1)){
				left = s.substring(0, n -1);
				right = "";
			} else {
				left = s.substring(0, i);
				right = s.substring(i + 1, n);
			}
			for (int j=0; j<left.length(); j++){
				char c = left.charAt(j);
				if (c == 'W'){
					change++;
				}
			}
			for (int j=0; j<right.length(); j++){
				char c = right.charAt(j);
				if (c == 'E'){
					change++;
				}
			}
			changeMin = Math.min(changeMin, change);
		}
		System.out.println(changeMin);
	}
}
