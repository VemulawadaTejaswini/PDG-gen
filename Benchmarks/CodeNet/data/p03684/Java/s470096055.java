import java.util.*;

public class Main {                  
    
    public static void main(String[] args){     
        Scanner sc = new Scanner(System.in);
                                                
        int N = sc.nextInt();
        
        int x[] = new int[N];
        int y[] = new int[N];
        
        for(int i = 0;i < N;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        
        int ans = 0;
        
        for(int start = 0;start <= N - 2;start++){
           for(int goal = start+1;goal < N;goal++){
               int min = Math.min(Math.abs(x[start]-x[goal]),Math.abs(y[start] - y[goal]));
               ans = Math.max(ans,min);
           }
        }        
                        
        System.out.println(ans);
        
    }            
}