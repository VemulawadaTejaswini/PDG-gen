import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long a = scan.nextLong();
        long b = scan.nextLong();
        long sum = a + b;
        long count = 0;
        if(a == 0){
            System.out.println(0);
        }
        long num = n / sum;
        count = num * a;
        long c = n % sum;
        if(c < a){
            count = count + c;
        }else {
            count = count + a;
        }
        System.out.println(count);
    }

}