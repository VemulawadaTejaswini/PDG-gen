import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int max = 0;
        if(a == 0) a += 1;
        if(b == 0) a -= 1;
        if(c == 0) a += 1;
        if(d == 0) a -= 1;
        max = Math.max(max, a * c);
        max = Math.max(max, a * d);
        max = Math.max(max, b * c);
        max = Math.max(max, b * d);
        System.out.println(max);
    }
}
