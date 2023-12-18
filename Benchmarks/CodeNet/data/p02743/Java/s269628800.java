import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        if(Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

}
