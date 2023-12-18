import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.next());
		String s = scanner.next();

		int red = 0;

		for(int i = 0; i < n; i++){
			char c = s.charAt(i);
			if(c == 'R')
				red++;
		}

		int blue = n - red;

		if((red - blue) > 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
