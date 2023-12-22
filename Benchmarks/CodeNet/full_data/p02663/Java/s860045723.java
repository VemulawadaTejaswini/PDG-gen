import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        
        int tmpb = c * 60 + d;
        int tmpa = a * 60 + b;
        
        int tmpc = tmpb - tmpa;
        int tmpd = tmpc / e;
        int tmpx = tmpc - e;
        System.out.println(tmpx);
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        
        int tmpb = c * 60 + d;
        int tmpa = a * 60 + b;
        
        int tmpc = tmpb - tmpa;
        int tmpd = tmpc / e;
        int tmpx = tmpc - e;
        System.out.println(tmpx);
    }
}
