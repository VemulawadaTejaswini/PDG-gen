import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(4 * x >= y && (4 * x - y) % 2 == 0){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}