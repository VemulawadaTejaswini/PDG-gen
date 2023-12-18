import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // input N
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num / 2 + num % 2);
    }
}
