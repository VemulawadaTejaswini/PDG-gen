import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Long h = scan.nextLong();

        System.out.println(calc(h)/2);
    }

    static long counter = 0;
    static long cc = 0;
    static long calc(long h){
        cc++;
        if(h != 0){
            counter += Math.pow(2,cc);
            return calc(h/2);
        }else{
            return counter;
        }
    }

    static int factorial(int n){
        if(n == 0){
          return 1;
        }
        return n * factorial(n-1);
      }
}