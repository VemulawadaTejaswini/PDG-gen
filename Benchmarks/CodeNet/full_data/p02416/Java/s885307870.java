import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			String line = sc.next();
			if (line.equals("0")){
				break ;
			}
			int sum = 0;
			for(int i = 0; i < line.length(); i++){
				sum += (line.charAt(i) - '0');
			}
			System.out.println(sum);
		}
	}
}
