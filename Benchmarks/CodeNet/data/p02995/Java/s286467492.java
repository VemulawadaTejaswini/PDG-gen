import java.util.*;

public class Main {
    static long lcm(long a, long b){
        long temp;
        long c = a;
        
        c *= b;
        
        while((temp = a % b) != 0){
            a = b;
            b = temp;
        }
        
        return c / b;
    }
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        long CD = lcm(C, D);
        long C_dev = 0;
        long D_dev = 0;
        long CD_dev = 0;
        
        for(long i = A; i <= B; i++){
            if(i % CD == 0){
                CD_dev++;
            }else if(i % C == 0){
                C_dev++;
            }else if(i % D == 0){
                D_dev++;
            }else{
                
            }
        }
        
        System.out.println(B - A - C_dev - D_dev + CD_dev - 1);
    }
}
