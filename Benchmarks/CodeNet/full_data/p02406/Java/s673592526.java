import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = scan.nextInt();
        for (int i = 1; i < sum; i++) {
        	String x = String.valueOf(i);
            if (i % 3 == 0 || x.indexOf("3") != -1){
            	System.out.print(" " + i);
            }
        }
	}
}