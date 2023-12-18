import java.util.*;

public class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int[] p = new int[N];
       int count = 0;
       int next_count = 0;
       int max_count = 0;
       int min_count = 0;
       int change = 0;
       for(int i = 0; i < N; i++){
           p[i] = sc.nextInt();
       }
       int max = p[1]; 
       int min = p[1];
       for(int i = 0; i < N -1; i++){
           if(p[i] < p[i + 1]){
               count++;
           }
           if(p[i] < min){
           }
       }
       for(int i = 0; i < N ; i++){
        if(max < p[i]){
            max = p[i];
            max_count = i;
        }
        if(p[i] < min){
            min = p[i];
            min_count = i;
        }
    }
       if(count == N-1){
           System.out.println("YES");
       }else{
            change = max_count;
            max_count = min_count;
            min_count = change;
            p[max_count] = max;
            p[min_count] = min;
            for(int i = 0; i < N -1; i++){
                if(p[i] < p[i + 1]){
                    next_count++;
                }
            }
            if(next_count == N-1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
                for(int i = 0; i < N ; i++){
                    System.out.print(p[i]);
                }
            }
       }
    }
}   