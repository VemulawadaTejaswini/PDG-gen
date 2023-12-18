import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int aa = (int) (a * 12.5);
        if (aa / 10 == b) {
            System.out.println(aa);
        } else {
            System.out.println(- 1);
        }
    }
}