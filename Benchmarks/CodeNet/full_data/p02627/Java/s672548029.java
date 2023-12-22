import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if(a.equals(a.toLowerCase())){
            System.out.println("a");
        } else {
            System.out.println("A");
        }

    }

}
