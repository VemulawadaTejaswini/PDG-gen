import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer n = scan.nextInt();
        Integer m = scan.nextInt();

        if(n==m)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    static int factorial(int n){
        if(n == 0){
          return 1;
        }
        return n * factorial(n-1);
      }
}
