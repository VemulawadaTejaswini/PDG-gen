import org.w3c.dom.ls.LSOutput;
import java.util.*;
public class Main {
    static boolean visited[] = new boolean[1002];
    static boolean counted[] = new boolean[1002];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n-=400;
        System.out.println(8-n/200);
    }
}




