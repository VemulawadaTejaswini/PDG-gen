import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			String s = sc.next();

			int count = 0;
			int len = s.length();
			char[] sArray = s.toCharArray();
			for(int i = 0 ; i <len ; i++ ) {
				
				int[] residuals = new int[len];
				for(int j = 0 ; j < len - i; j++ ) {
					
					if ( j < 3 ) {
						continue;
					}
					if ( j == 3 ) {
						String sub = s.substring(i, i + j + 1);
						int num = Integer.parseInt(sub);
						residuals[j] = num % 2019;
					}
					else {
						//current num
						int num = (int)sArray[i+j] - 48;
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