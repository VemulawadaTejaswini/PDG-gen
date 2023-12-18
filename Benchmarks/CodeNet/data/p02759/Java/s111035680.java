import java.util.*;

public class Main {
    Integer result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        if (count % 2 == 0) {
            System.out.println(count / 2);
        } else {
            System.out.println((count / 2) + 1);
        }
    }

}