import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		while(true){
			int sum = 0;
			String S = s.nextLine();
			
			if(S.charAt(0) == '0') break;
			
			for(int i = 0;i < S.length(); i++){
				sum += Integer.parseInt("" + S.charAt(i));
			}	
			System.out.println(sum);
		}
	}
}
