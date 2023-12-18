import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        
        String[] countABC = S.split("ABC", 0);
        
        System.out.println(countABC.length - 1);
    }
}