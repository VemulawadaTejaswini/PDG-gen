import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        d = sc.nextInt();
        int[][] x = new int[n][d];
        for(int i=0; i<n; i++){
            for(int j=0; j<d; j++){
                x[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i*i<16000; i++){
            square[i] = i*i;
        }
        
        int c = 0;
        
        
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(check(x[i],x[j])) c++;
            }
        }
        
        System.out.println(c);
        
    }
    
    public static int n, d;
    public static int[] square = new int[160];
    
    static boolean check(int[] x1, int[] x2){
        int s = 0;
        for(int i=0; i<d; i++){
           s += (x1[i] - x2[i]) * (x1[i] - x2[i]);
        }
        for(int i=0; i<160; i++){
            if(square[i] == s) return true;
        }
        return false;
    }
}
