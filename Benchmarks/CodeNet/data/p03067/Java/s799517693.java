import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int a = kbd.nextInt();
        int b = kbd.nextInt();
        int c = kbd.nextInt();

        if (a < b) {
            if (a < c && c < b) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }else{
        if (a > c && c > b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

}