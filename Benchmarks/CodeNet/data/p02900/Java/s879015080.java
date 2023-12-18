import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long gcd = GCD(A,B);
        int num = DIV(gcd);
        System.out.println(num+1);
    }
    public static long GCD(long num1,long num2){
        if(num1%num2==0) return num2;
        return GCD(num2,num1%num2);
    }
    public static int DIV(long A){
        Set<Long> set = new HashSet<>();
        for(long i=2;i*i<=A;){
            if(A%i==0) {
                set.add(i);
                A/=i;
            }
            else i++;
        }
        if(A>(long)1) set.add(A);
        return set.size();
    }
}
