import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        for (char c : arr) {
            if (c == '7') {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}