import java.util.*;

public class Main {

    static final int MOD=1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int[] fridge = new int[a];
        int[] microwave = new int[b];
        int min_fridge=Integer.MAX_VALUE;
        int min_microwave = Integer.MAX_VALUE;

        for(int i=0;i<a;i++){
            fridge[i]=sc.nextInt();
            min_fridge=Math.min(min_fridge,fridge[i]);
        }
        for(int i=0;i<b;i++){
            microwave[i]=sc.nextInt();
            min_microwave=Math.min(min_microwave,microwave[i]);
        }

        int ans = min_fridge+min_microwave;

        for(int i=0;i<m;i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            int c = sc.nextInt();
            ans = Math.min(ans,fridge[x]+microwave[y]-c);
        }

        System.out.println(ans);


    }
}


