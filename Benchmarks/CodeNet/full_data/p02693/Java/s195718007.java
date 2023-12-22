import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
      
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
      
      int largest = (b / k) * k;
		
		if (a <= largest) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}     
    }
}