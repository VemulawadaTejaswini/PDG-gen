import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			String s = scanner.nextLine();
			char[] c = s.toCharArray();
			int sum = 0;

			if(s == "0"){
				break;
			}

			for(int i = 0; i < s.length; i++){
				sum += Integer.parseInt(c[i]);
			}

			System.out.println(sum);
		}
	}
}