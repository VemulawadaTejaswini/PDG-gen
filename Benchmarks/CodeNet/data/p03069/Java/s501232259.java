import java.util.*;

public class Main{
    
    public static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        char[] s = sc.next().toCharArray();
        int[] white = new int[n+1];
        int[] black = new int[n+1];
        
        for(int i=0; i<n; i++){
            if(s[i]=='.'){
                white[i] = 1;
            }else{
                black[i+1] = 1;
            }
        }
        
        for(int i=0; i<n; i++){
            white[n-i-1] += white[n-i];
            black[i+1] += black[i];
        }
        
        int min = (int)1e6;
        for(int i=0; i<n; i++){
            int sum = white[i+1] + black[i+1];
            min = Math.min(min, sum);
        }
        
        System.out.println(min);
    }
}
