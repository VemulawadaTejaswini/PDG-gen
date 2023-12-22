import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int A = s1.nextInt();
        int B = s1.nextInt();
        for(int i = A; i <= B; i++) {
            if(i % n == 0) {
                System.out.println("OK");
                return;
            }
        }
        System.out.println("NG");
    }
}
