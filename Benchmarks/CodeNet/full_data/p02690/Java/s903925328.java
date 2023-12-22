import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long a = 1;
        boolean bool = true;
        while (a*a*a*a*a<=x&&bool){
            long b = -a*a*a*a*a;
            while (b*b*b*b*b<=a&&bool){
                if (a*a*a*a*a-b*b*b*b*b==x){
                    bool=false;
                    System.out.println(a+" "+b);
                }
                b++;
            }
            a++;
        }
    }
}
