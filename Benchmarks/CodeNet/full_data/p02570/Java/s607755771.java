import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        int t = in.nextInt();
        int s = in.nextInt();

        if(d/s > t) System.out.println("No");
        else System.out.println("Yes");
    }
}