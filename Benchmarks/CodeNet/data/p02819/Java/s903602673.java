import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        while(!isPrime(x)){
            x++;
        }
        System.out.println(x);
        scan.close();
    }
    
    public static boolean isPrime(int x){
        for(int i = 2; i <= Math.sqrt(x); i++){
            if(x % i == 0) return false;
        }
        return true;
    }
}