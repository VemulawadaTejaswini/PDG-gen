import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        sc.nextLine();
        int m2 = sc.nextInt();
        sc.nextLine();
        
        System.out.println(m1 != m2 ? '1': '0');
    }
}
