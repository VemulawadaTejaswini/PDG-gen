
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
               long x=scan.nextLong();
               long k=scan.nextLong();
               long d=scan.nextLong();
               if(x==k && x==d && k==d){
                   System.out.print(x);
               }else {
                   for (long i = 0; i < k; i++) {
                       x = Math.min(Math.abs(x - d), x);
                   }
                   System.out.print(x);
               }
    }
}
