import java.util.*;
 
import java.io.*;
 
public class Main{
 
    public static long Combination(long n, long r){
        long A = 1;
        long B = 1;
        for(long i = 0; i < r; i++){
            A = A*(n-i);
            B = B*(r-i);
        }
        if(A == 0) return 0;
        return A/B;
    }
 
    public static long solve(int i, int j, boolean check, int N, String S){
        if(i == N){
            if(j == 0){
                return 1;
            }else{
                return 0;
            }
        }
 
        if(j == 0) return 1;
 
        if(check){
            return Combination(N-i, j)*(long)Math.pow(9, j);
        }else{
            if(S.charAt(i) == '0') return solve(i+1, j, false, N, S);
            long Z = solve(i+1, j, true, N, S);
            long A = solve(i+1, j-1, true, N, S)*(S.charAt(i)-'1');
            long P = solve(i+1, j-1, false, N, S);
            return Z+A+P;
        }
 
 
    }
    
    public static long Dflag(long a){
        if(a == 1) return 1;
        long h = Dflag(a/2);
        return h + h + 1;
    }
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        String S = s.next();
        String T = s.next();
        boolean c = false;

        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == T.charAt(i)){

            }else{
                c = true;
            }
        }
        
        if(c){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        
	}
} 