
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n  = s.nextInt();
        long num, sum=0;
        for(int i = 1; i <= n; i++) {
            num = findDivisors(i);
//            System.out.println(i+" "+num);
            sum = sum + num * i; 
        }
        System.out.println(sum);
    }
    public static long findDivisors(int n) {
        long count = 0;
        for(int i=1; i <= n/2; ++i) {
            if(n%i==0)
                count++;
        }
        return count+1;
    }
}
