import java.util.*;
 
public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        if(C%gcd(A,B) == 0)
            System.out.println("YES");
        else
            System.out.println("NO");

        
    }
    static int gcd(int n, int m){
        if(m > n)
            return gcd(m, n);
        else {
            if(m == 0)
                return n;
            else
                return gcd(m, n%m);
        }
    }
}