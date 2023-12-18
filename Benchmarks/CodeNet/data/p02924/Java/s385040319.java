import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int num[] = new int[n];
        int w[] = new int[n];
        int sum = 0;
        
        
        for(int i = 1; i < n; i++){
            num[i] = i + 1;
            w[i - 1] = i + 1;
        }
        
        num[0] = 1;
        w[0] = 2;
        w[n - 1] = 1;
        
        for(int i = 0; i < n; i++){
            sum += num[i] % w[i];
            //System.out.println(num[i] + " " + w[i]);
        }
        
        System.out.println(sum);
    }
}
