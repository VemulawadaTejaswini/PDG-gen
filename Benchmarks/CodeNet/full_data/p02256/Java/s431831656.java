import java.util.Scanner;
//gcd(x, y) = gcd(y, x%y)
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        System.out.println(helper(a,b));
    }
    public static int helper(int a, int b){
       if(b == 0){
         return a;     
       } else {
         return  helper(b, b % a);
       }
    }
}
