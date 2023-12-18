import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b == 1) {
            System.out.println(0);
            return;
        }
        int res = 1;
        int total = a;
        while (total < b) {
            total += (a - 1);
            res += 1;
        }
        System.out.println(res);
    }

}
