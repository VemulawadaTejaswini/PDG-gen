import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int takahashi=0;
		
		for(int month = 1 ; month <= a ; month ++) {
			for(int day = 1; day <= 31 ; day ++) {
				if(month==a && day>b) {
					break;
				}
				if(month == day ) {
					takahashi++;
				}
			}
		}
		System.out.println(takahashi);
	}
}
