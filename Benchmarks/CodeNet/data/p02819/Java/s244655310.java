import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        while (!isPrime(x)){
            x += 1;
        }
        System.out.println(x);


    }
    public static boolean isPrime(int x){
        int i=2;
        while (i*i<=x){
            if (x%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}