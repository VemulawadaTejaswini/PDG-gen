import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			String s = sc.next();
			
			int count = 0;
			for(int i = 0 ; i < s.length() ; i++ ) {
				for(int j = i ; j < s.length() +1; j++ ) {
					if ( i == j) continue;
					
					String sub = s.substring(i, j);
//					System.out.println(sub);
					
					long num = Long.parseLong(sub);
					
					if ( num % 2019 == 0 ) {
						count++;
					}
				}
			}
			
			System.out.println(count);
			
		}
	}

}