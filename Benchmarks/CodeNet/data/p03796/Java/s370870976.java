import java.util.Scanner;

public class Main {
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
			long value =Main.factorial(sc.nextInt());
			System.out.println(value % (1000000000+7));
    	}

    	private static int factorial(int number) {
    		if(number == 1) {
    			return 1;
    		}
    		else {
    			return number * Main.factorial(number - 1);
    		}
    	}
    }