import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			String s = scanner.nextLine();
			int sum = 0;

			if(s == "0"){
				break;
			}

			for(int i = 0; i < s.length(); i++){
				char ch = s.charAt(i);
				sum += Character.getNumericValue(ch);
			}

			System.out.println(sum);
		}
	}
}