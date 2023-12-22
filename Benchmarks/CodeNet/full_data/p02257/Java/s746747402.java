import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int count = 0;
        for(int i = 0; i <a; i++ ){
            if(isPrime(input.nextInt())){
                count++;
            }//if
        }//for
        System.out.println(count);
    }//main
    
     private static boolean isPrime(int a) {
        if(a < 2) {
            return false;
        }//if 
        if(a == 2) {
            return true;
        }//if
        if(a % 2 == 0) {
            return false;
        }//if
        
        double sqrt = Math.sqrt(a);
        for (int i = 3; i <= sqrt; i += 2) {
            if (a % i == 0) {
                return false;
            }//if
        }//for
        return true;
    }//isPrime
}//main
