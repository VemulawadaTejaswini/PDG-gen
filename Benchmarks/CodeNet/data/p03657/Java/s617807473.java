import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        String ans=(a%3!=0&&b%3!=0&&(a+b)%3!=0)?"Impossible":"Possible";
        System.out.println(ans);
    }
}

