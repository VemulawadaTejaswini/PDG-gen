
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        if(a!=0){
        System.out.println(b/x-(a-1)/x);
        }else{
            System.out.println(b/x);
        }

    }
}