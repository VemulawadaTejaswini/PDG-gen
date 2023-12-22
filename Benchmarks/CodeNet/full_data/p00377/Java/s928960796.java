
import java.util.*;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int C = scan.nextInt();
        int p;
        int total = 0;
        for (int i = 0; i < C; i++) {
            p = scan.nextInt();
            total += p;   
        }
        
        if(total % (N + 1) == 0){
            System.out.println(total / (N+1));
            
       } else {
            System.out.println((total / (N+1)) + 1);
       
        }
    
    }
}
