
import java.util.Scanner;
import java.lang.Math;

class Main{
    static Scanner s;
    
    public static void main(String args[]){
        s = new Scanner(System.in);
        
        int amount = s.nextInt();
        
        int count = 0;
        for(int i = 0; i < amount; i++){
            if(isPrime(s.nextInt())){
                count++;
            }
        }
        
        System.out.println(count);
    }
    
    static double sqrt;
    public static boolean isPrime(int x){
        sqrt = Math.sqrt(x);
        if(x == 2) {
        	return true;
        }
        if(x%2 == 0){
            return false;
        }
        else {
        	for(int i = 3; i <= sqrt; i = i + 2){
        		//System.out.println("Checking " + x +" against "+ i);
        		if(x%i == 0){
        			return false;
        		}
            }
        }
        
        return true;
    }
    
}
