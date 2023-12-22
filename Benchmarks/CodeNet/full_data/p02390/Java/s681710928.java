import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int sc = sr.nextInt();
        int h = 0; int m = 0; int s = 0;
        while (sc > 3600) {
            h++;
            sc = sc - 3600;
        }
        while (sc > 60) {
            m++;
            sc = sc - 60;
        }
        while (sc > 0) {
            s++;
            sc = sc - 1;
        }
        System.out.println(h + ":" + m + ":" + s);
    }
}