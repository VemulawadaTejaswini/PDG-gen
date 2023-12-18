import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		int changeMin = n;
		int change=0;

		for (int i=0; i<n; i++){
			if (i == 0){
				for (int j=1; j<n; j++){
					if (s.charAt(j) == 'E'){
						change++;
					}
					changeMin = change;
				}
			} else {
				if (s.charAt(i-1) == 'W'){
					change++;
				}
				if (s.charAt(i) == 'E'){
					change--;
				}
				changeMin = Math.min(changeMin, change);
			}
		}
		System.out.println(changeMin);
	}
}
