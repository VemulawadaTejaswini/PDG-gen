import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long a = 1;
        boolean bool = true;
        while (a*a*a*a*a<=x&&bool){
            long b = 0;
            while (b*b*b*b*b<=a&&bool){
                if (a*a*a*a*a-b*b*b*b*b==x){
                    bool=false;
                    System.out.println(a+" "+b);
                }
                b++;
            }
            if (bool){
                b=0;
                while (a*a*a*a*a+b*b*b*b*b<=x&&bool){
                    if (a*a*a*a*a+b*b*b*b*b==x){
                        bool=false;
                        System.out.println(a+" "+(-b));
                    }
                    b++;
                }
            }
            a++;
        }
    }
}
