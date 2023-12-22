import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        double A=Double.parseDouble(scan.next());
        double B=Double.parseDouble(scan.next());
        System.out.println((long)Math.ceil(A*B));
    }
}
