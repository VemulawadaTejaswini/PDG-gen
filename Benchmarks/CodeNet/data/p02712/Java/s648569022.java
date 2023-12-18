import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long sum = 0;
        for(int i=1;i<=N;i++)
        {
            if(i%3!=0) sum = sum + i;
            if(i%5!=0) sum = sum + i;
            if(i%15!=0) sum = sum - i;
            
        }
        System.out.println(sum);
    }
}
