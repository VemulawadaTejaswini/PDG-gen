import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n==0) break;
            int sum = 0;
            int max = 0;
            int min = 1000;
            for(int i = 0; i<n; i++){
                int in = sc.nextInt();
                sum+=in;
                if(max<in) max = in;
                if(min>in) min = in;
            }
            sum -= (min+max);
            sum /= n-2;
            System.out.println(sum);
        }
        sc.close();
    }
}
    
