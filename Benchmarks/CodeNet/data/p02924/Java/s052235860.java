import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        long sum = 0;

        for(int i = 1; i <= N; i++){
            if(i != N)
                sum += i;
        }

        System.out.println(sum);
        
    }
}