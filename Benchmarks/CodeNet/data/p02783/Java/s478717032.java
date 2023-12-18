import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer h = scan.nextInt();
        Integer a = scan.nextInt();
        
        if(h%a == 0)
            System.out.println((h/a));
        else
        System.out.println((h/a)+1);
    }

    static int factorial(int n){
        if(n == 0){
          return 1;
        }
        return n * factorial(n-1);
      }
}