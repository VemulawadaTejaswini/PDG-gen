import java.util.*;

public class Main{
    private static void solve(int N, int H, int[] attack, int[] throwk){
        int count = 0;
        int sum = 0;
        Arrays.sort(attack);
        int maxa = attack[N - 1];
        Arrays.sort(throwk);
        for(int i = N - 1; throwk[i] > maxa && i > 0; i --){
            sum += throwk[i];
            count ++;
            if(sum >= H){
                System.out.print(count);            
                return;                
            }
        }
        if(throwk[0] > maxa){
            sum += throwk[0];
            count ++;
        }
        if(sum >= H){
            System.out.print(count);            
            return;                
        }
        count = (int)(count + Math.ceil((double)(H - sum) /maxa));
        System.out.print(count);            
        return;    
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int H = input.nextInt();
        int[] attack = new int[N];
        int[] throwk = new int[N];
        for(int i = 0; i < N; i ++){
            attack[i] = input.nextInt();
            throwk[i] = input.nextInt();
        }
        input.close();
        solve(N, H, attack, throwk);
    }
}