import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        if (N.length() == 3) {
            getPro(Integer.parseInt(N.substring(2)));
        } else if (N.length() == 2) {
            getPro(Integer.parseInt(N.substring(1)));
        } else {
            getPro(Integer.parseInt(N.substring(0)));
        }

    }

    private static void getPro(int num){
        if (num == 2 || num == 4 || num == 5 ||num == 7 ||num == 9) {
            System.out.println("hon");
        } else if (num == 0 || num == 1 || num == 6 ||num == 8) {
            System.out.println("pon");
        } else {
            System.out.println("bon");
        }
    }
}