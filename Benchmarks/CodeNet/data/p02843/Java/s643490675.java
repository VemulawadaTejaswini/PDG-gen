import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int tenth = x % 100;
        int count = 0;
        int i105 = (int)Math.floor(tenth/5.0);
        tenth -= i105*5;
        count += i105;
        int i104 = (int)Math.floor(tenth/4.0);
        tenth -= i104*4;
        count += i104;
        int i103 = (int)Math.floor(tenth/3.0);
        tenth -= i103*3;
        count += i103;
        int i102 = (int)Math.floor(tenth/2.0);
        tenth -= i102*2;
        count += i102;
        int i101 = (int)Math.floor(tenth/1.0);
        tenth -= i101*1;
        count += i101;
        System.out.println(count*100<=x ? 1 : 0);
    }
}
