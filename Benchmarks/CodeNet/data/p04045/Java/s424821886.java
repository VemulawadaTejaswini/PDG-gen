import java.util.*;

public class Main{
    static String N;
    static int K;
    static char[] D;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        N = sc.next();
        K = sc.nextInt();
        D = new char[K];
        for(int i = 0; i < K; i++){
            D[i] = sc.next().charAt(0);
        }
        sc.close();

        int start = Integer.valueOf(N);
        while(!(is(start))){
            start++;
        }
        System.out.println(start);
    }

    static boolean is(int n){
        String s = String.valueOf(n);
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < K; j++){
                if(s.charAt(i) == D[j])
                    return false;
            }
        }
        return true;
    }
}