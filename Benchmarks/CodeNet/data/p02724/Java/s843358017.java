import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int input = sc.nextInt();
         int gohyaku = input / 500;
         int nokori = input % 500;
         int five = nokori / 5;
         System.out.println(gohyaku + five);
    }
}
