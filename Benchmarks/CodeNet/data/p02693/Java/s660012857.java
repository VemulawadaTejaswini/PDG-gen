import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean isPossible = false;
        for(int i = a;i <= b;i++) {
            if(i % n == 0) {
                isPossible = true;
                break;
            }
        }

        String ans = isPossible ? "OK" : "NG";
        System.out.println(ans);
    }
}