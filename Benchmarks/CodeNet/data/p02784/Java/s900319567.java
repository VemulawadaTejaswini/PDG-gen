import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int power = Integer.parseInt(scan.next());
        int cnt = Integer.parseInt(scan.next());

        //int second = Integer.parseInt(scan.next());
        //long in = Long.parseLong(scan.next());
        //String s = scan.next();
        //String second = scan.next();
        int sum = 0;
        for (int i = 0; i <cnt; i++) {
            sum += Integer.parseInt(scan.next());
        }
        result(sum>=power);
    }

    public static void result(boolean flg) {
        if(flg) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
