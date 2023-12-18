import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y;

        while (true) {
            x++;
            if (x%2 != 0 && x%3 != 0 && x%4 != 0 && x%5 != 0) {
                y = x;
                break;
            }
        }
        System.out.println(y);


    }
}
