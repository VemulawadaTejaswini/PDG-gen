import java.util.*;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N  = sc.nextInt();
    int K  = sc.nextInt();
    int[]P = new int[N];
    
    for(int i=0; i<N; i++){
        P[i] = sc.nextInt();
        }
    Arrays.sort(P);
    int ans = 0;
    for(int i=0; i<K; i++){
        ans += P[i];        
    }
    	System.out.println(ans);
}
}