import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int S = s.nextInt();

        int W = s.nextInt();

        if(S > W) {
            System.out.println("safe");
        } else {
            System.out.println("unsafe");
        }
    }
}