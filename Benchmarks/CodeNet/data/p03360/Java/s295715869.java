
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int k=scanner.nextInt();
        int max=Math.max(Math.max(a,b),c);
        System.out.println((int)(a+b+c+max*Math.pow(2,k)-max));
    }
}
