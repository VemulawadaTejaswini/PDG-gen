import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        final int Mod = 1000000000+7;
        int[] rec= new int[N+1];
        long ans = 1;
        for(int i=2;i<=N;i++){
            int k=i;
            for(int j=2;j<=k;j++){
                while(k%j==0){
                    rec[j]++;
                    k = k/j;
                }
            }
            //if(k>0) rec[k]++;
        }
        for(int i=2;i<=N;i++){
            if(rec[i]>0) ans = ans*(rec[i]+1)%Mod;
        }
        System.out.println(ans%Mod);
    }
}
