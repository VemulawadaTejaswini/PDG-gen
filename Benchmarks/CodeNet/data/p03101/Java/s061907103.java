import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int grids = a * b;
        if (grids - (b * c) == 0) {
            System.out.println(0);
        } else {
            System.out.println(grids - (b * c + (a * d - (c * d))));   
        }
    }
}
