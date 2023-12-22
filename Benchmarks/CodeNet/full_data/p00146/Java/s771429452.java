import java.util.*;

class Main{
    
    int n;
    int[] kura, shiro, sen;
    double min;
    ArrayList<Integer> list;
    
    void solve(){
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        
        kura = new int[n];
        shiro = new int[n];
        sen = new int[n];
        for(int i=0; i<n; i++){
            kura[i] = sc.nextInt();
            shiro[i] = sc.nextInt();
            sen[i] = sc.nextInt();
        }
        
        double[][] dp = new double[1<<n][n];
        int[][] before = new int[1<<n][n];
        int[][] weight = new int[1<<n][n];
        for(int i=0; i<1<<n; i++){
            Arrays.fill(dp[i], -1.0);
            Arrays.fill(before[i], -1);
            Arrays.fill(weight[i], -1);
        }
        dp[0][0] = 0;
        for(int bit=0; bit<1<<n; bit++){
            for(int i=0; i<n; i++){
                if(dp[bit][i]>-1){
                    for(int j=0; j<n; j++){
                        if((bit&(1<<j))>0) continue;
                        double nn = dp[bit][i] + Math.abs(shiro[i] - shiro[j]) / (2000.0/(double)(70+weight[bit][i]));
                        int newBit = bit^(1<<j);
                        if(dp[newBit][j]<=0 || dp[newBit][j]>nn){
                            dp[newBit][j] = nn;
                            before[newBit][j] = i;
                            weight[newBit][j] = weight[bit][i] + sen[j] * 20;
                        }
                    }
                }
            }
        }

        int idx = 0;
        double min = Double.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(dp[(1<<n)-1][i]>-1 && dp[(1<<n)-1][i]<min){
                min = dp[(1<<n)-1][i];
                idx = i;
            }
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();   
        list.add(new Integer(kura[idx]));
        int b = (1<<n)-1;
        while(before[b][idx]!=-1){
            list.add(new Integer(kura[before[b][idx]]));
            int newbit = b ^ (1<<idx);
            idx = before[b][idx];
            b = newbit;
        }

        
        for(int i=list.size()-2; i>0; i--) System.out.print(list.get(i)+" ");
        System.out.println(list.get(0));
    }

    public static void main(String[] args){
        new Main().solve();
    }
}