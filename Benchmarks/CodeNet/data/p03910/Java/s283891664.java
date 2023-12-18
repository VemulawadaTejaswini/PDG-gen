import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.close();

        int sum = 0;
        int count = 1;
        while(sum < N){
            sum += count;
            count++;
        }
        
       for(int i = 1; i < count; i++){
           if(i != sum - N)
                System.out.println(i);
       }
    }
}