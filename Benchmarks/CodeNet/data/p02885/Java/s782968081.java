import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int windowWidth = sc.nextInt();
        int curtainsWidth = sc.nextInt() * 2;

        System.out.println(curtainsWidth >= windowWidth ? 0 : windowWidth - curtainsWidth);
    }
}