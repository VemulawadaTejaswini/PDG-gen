import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = 100000;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int next = (int) ((base * 1.05) / 1000) * 1000;
            if ((base * 1.05) % 1000 > 0){
                next += 1000;
            }
            base = next;
        }
        System.out.println(base);
    }
}