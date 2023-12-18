import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        char ch = (char)('C' + (n / 1000));
        System.out.println("AB" + ch);
    }
}
