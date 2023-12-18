import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			String s = sc.next();

			int count = 0;
			for(int i = 0 ; i < s.length() ; i++ ) {
				
				int[] residuals = new int[s.length()];
				for(int j = 0 ; j < s.length() - i; j++ ) {
					
					if ( j < 4 ) {
						String sub = s.substring(i, i + j + 1);
						int num = Integer.parseInt(sub);
						residuals[j] = num % 2019;
					}
					else {
						//current num
						String sub = s.substring(i + j, i + j + 1);
						int num = Integer.parseInt(sub);
						residuals[j] = (residuals[j-1] * 10 + num) % 2019; 
					}
					
					if ( residuals[j] == 0 ) {
						count++;
					}
				}
			}
			
			System.out.println(count);
		}
	}

}