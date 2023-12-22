import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s;
		
		while (true){
			s = scan.next();
			if (s.charAt(0) == '0'){
				break;
			}
			
			int sum = 0;
			
			for (int i = 0; i < s.length(); i++){
				sum += s.charAt(i) - '0';
			}
			System.out.println(sum);
		}
	}
}