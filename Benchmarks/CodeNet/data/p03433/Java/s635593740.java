import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        
        if( n <= a || n % 500 == 0 || n % 500 <= a ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
