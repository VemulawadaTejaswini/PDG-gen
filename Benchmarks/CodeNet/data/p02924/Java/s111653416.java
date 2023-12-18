import java.util.*;

public class Main {

    public static void main(String[] args) {
        exec();
    }

    static void exec() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n == 1) {
            System.out.println(0);
            System.exit(0);
        }
        
        System.out.println((n*(n-1))/2);
    }
}
