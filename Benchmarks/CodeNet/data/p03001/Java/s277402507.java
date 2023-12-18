import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        String split = "0";
        if (W/2 == X && H/2 == Y) {
            split = "1";
        }
        System.out.println(W*H/2.0 + " " + split);
    }    
}
