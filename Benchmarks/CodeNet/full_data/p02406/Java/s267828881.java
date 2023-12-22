import java.util.Scanner;

//20180508
//09

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		for(int i = 1;i <= num;i++) {
			if((i % 3 == 0) ||(i % 10 == 3)) {
				System.out.printf(" %d", i);
			}
		}
		System.out.println();

    	scanner.close();
    }
}
