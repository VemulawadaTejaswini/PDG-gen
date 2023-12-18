import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long A = sc.nextLong();
        long B = sc.nextLong();
        sc.close();

        long min = Math.min(A, B);
        long max = Math.max(A, B);
        long count = 1;
        long limit = (long)Math.sqrt(min)+1;
        for(int i = 2; i <= limit; i++){
            if(min%i == 0){
                while(min%i == 0){
                    min /= i;
                }
                if(max%i == 0){
                    count++;
                }
            }
        }
        if(Math.min(A, B) != 1 && min == Math.min(A, B)){
            if(max%Math.min(A, B) == 0)
                count++;
        }
        System.out.println(count);
    }
}