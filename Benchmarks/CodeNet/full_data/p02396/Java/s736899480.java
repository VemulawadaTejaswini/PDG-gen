import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int case_num = 1;

		while(scanner.hasNextLine()) {
			String input_str = scanner.nextLine();
			int x = Integer.parseInt(input_str);

			if(x >= 1  && x <= 10000) {
				System.out.println("Case " +case_num+": "+x);
				case_num++;
			}
		}

    	scanner.close();
    }
}

