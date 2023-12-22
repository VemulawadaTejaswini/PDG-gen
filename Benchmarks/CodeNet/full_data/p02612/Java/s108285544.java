import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String price = scan.nextLine();

        System.out.println(Integer.parseInt(price) % 1000);
        scan.close();
    }
}
