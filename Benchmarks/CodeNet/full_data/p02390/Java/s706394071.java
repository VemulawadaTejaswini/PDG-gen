import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        int h =  (int) Math.floor(a / 60 / 60);
        int hh = (int) (a - (h * 60 * 60));
        int m = (int) Math.floor(hh / 60);
        int s = (int) (a - (h * 60 * 60) - (m * 60));
        System.out.println(h + ":" + m + ":" + s );

    }

}
