import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        var p = new int[n+1];
        for(int i = 1; i <= n; i++){
            p[i] = Integer.parseInt(sc.next());
        }
        var c = new int[n+1];
        for(int i = 1; i <= n; i++){
            c[i] = Integer.parseInt(sc.next());
        }
        
        long ans = Long.MIN_VALUE;
        var maxScore = new long[n+1];
        for(int i = 1; i <= n; i++){
            int pos = p[i];
            int move = 1;
            long score = c[pos];
            long max = score;
            maxScore[move] = max;
            while(pos != i && move < k){
                pos = p[pos];
                move++;
                score += c[pos];
                max = Math.max(score, max);
                maxScore[move] = max;
            }
            ans = Math.max(max, ans);
            if(pos == i && score > 0){
                if(k % move == 0){
                    int j = i + k%move;
                    if(j > n) j -= n;
                    ans = Math.max(score * (k / move -1) + maxScore[j], ans);
                }else{
                    ans = Math.max(score * (k / move) + maxScore[k%move], ans);
                }
            }
        }
        System.out.println(ans);
    }
}