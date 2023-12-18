import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
 
        String[] str = scan.nextLine().split(" ");
        
        int n = Integer.valueOf(str[0]);
        int m = Integer.valueOf(str[1]);
        
        if (n == m) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}