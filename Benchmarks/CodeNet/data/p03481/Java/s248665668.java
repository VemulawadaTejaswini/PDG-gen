import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int next = x ;
        int count = 0;
        while (next <= y) {
            next *= 2;
            count++;
        }
        System.out.println(count);
    }
}
