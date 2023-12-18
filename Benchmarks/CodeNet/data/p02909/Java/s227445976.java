import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String s[] = {"Sunny","Cloudy","Rainy"};
		
		for (int i = 0 ; i < 3 ; i++) {
			if (i == 2) {
				System.out.println(s[0]);
				break;
			}
			if(str.equals(s[i])) {
				System.out.println(s[i + 1]);
				break;
			}
			
			
		}
		
		
		
	}	
}