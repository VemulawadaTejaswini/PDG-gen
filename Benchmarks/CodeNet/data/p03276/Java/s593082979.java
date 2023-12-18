import java.util.*;

public class Main {


    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();
        int[] candle = new int[n];
        for (int i = 0; i < n;i++)
            candle[i] = sc.nextInt();
        int index =0;
        for (; index < n;index++)
            if (candle[index]>= 0)
                break;
        int min =Integer.MAX_VALUE;
        if (index == n){
            System.out.println(-candle[n-k]);
            return;
        }
        int i = n - index  >= k+1? 0: k-(n- index);
        for(; i<= index; i++){
            int l = i <=0 ? 0 : Math.abs(candle[index -i]);
            int r = i >=n? 0: Math.abs(candle[index+k-i-1]);
            if(r==0 || l == 0)
                min = Math.min(min, Math.max(l,r));
            else {
                int t = Math.min( l*2 + r , l+ r*2);
                min = Math.min(min, t);
            }

        }
        System.out.println( min);

    }

}