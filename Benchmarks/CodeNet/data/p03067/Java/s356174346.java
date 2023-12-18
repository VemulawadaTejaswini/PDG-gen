import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(c >= a && c <= b) System.out.println("Yes");
        else if(c >= b && c <= a) System.out.println("Yes");
        else System.out.println("No");

        sc.close();
 
    }
 
}
