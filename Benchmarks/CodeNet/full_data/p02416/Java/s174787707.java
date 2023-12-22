import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			String s = scanner.next();
			int sum = 0;

			for(int i = 0; i < s.length(); i++){
				char ch = s.charAt(i);
				sum += Character.getNumericValue(ch);
			}
			
			if(sum == 0){
			    break;
			}

			System.out.println(sum);
		}
	}
}