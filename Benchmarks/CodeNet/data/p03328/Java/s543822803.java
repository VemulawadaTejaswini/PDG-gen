import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int aa = 0;
        for (int i = 1; ; i++) {
            sum += i;
            if(sum >= a) {
                aa = sum - a;
                break;
            }
        }
        sum = 0;
        int bb = 0;
        for (int i = 1; ; i++) {
            sum += i;
            if(sum >= b) {
                bb = sum - b;
                break;
            }
        }
        if(aa == bb) {
            System.out.println(aa);
        } else {
            System.out.println(bb);
        }
    }
}