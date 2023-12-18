import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int a[] = new int[n];
        
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            a[i] = stdIn.nextInt();
            sum += a[i];
        }
        
        int msum = 0;
        int min = sum;
        int index = 2020202020;
        
        for(int i = 0; i < n; i++){
            msum += a[i];
            if(Math.abs(msum - (sum - msum)) < min){
                min = Math.abs(msum - (sum - msum));
                index = i;
            }
        }
        
        
        System.out.println(min);
    }
}
