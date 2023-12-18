import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x = x2 -x1;
        int y = y2 -y1;

        System.out.print(x2 - y + " ");
        System.out.print(y2 + x + " ");
        System.out.print(x1 - y + " ");
        System.out.println(y1 + x + " ");
        
    }
}
