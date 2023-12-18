import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        if(8 < a || 8 < b) {
            System.out.println(":(");
        } else {
            System.out.println("Yay!");
        }
    }
}
