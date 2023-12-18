import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int g = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        if((r*100+g*10+b) % 4 == 0) System.out.println("YES");
        else System.out.println("NO");
     }
}