import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long  a = scan.nextLong();
        long  b = scan.nextLong();
        long  c = scan.nextLong();
        long  d = scan.nextLong();
        long  e = b/c-a/c;
        if(a%c==0)e++;
        long  f = b/d-a/d;
        if(a%d==0)f++;
        long  g = b/(d*c)-a/(d*c);
        if(a%(d*c)==0)g++;
        System.out.println((b-a+1)-(e+f-g));
    }
}