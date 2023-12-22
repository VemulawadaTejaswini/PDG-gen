import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long N = scanner.nextLong();
        long x;
        if(B > N){
            x = N;
        }else{
            x = B-1;
        }
        long ans = (long)((double)A*(double)x/(double)B) - A * (long)((double)x/(double)B);
        System.out.println(ans);
    }
}