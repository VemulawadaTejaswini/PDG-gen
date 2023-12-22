import java.util.*;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), d = sc.nextLong(), count  = 0;
        while (n-->0){
            long a = sc.nextLong(), b = sc.nextLong();
            if(((a*a)+(b*b)) <= (d*d)){
                count++;
            }
        }
        System.out.println(count);
    }
}