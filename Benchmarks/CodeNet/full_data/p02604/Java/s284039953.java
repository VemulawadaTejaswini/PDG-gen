import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] X = new int[N];
        int[] Y = new int[N];
        int[] P = new int[N];
        int[] nowMin = new int[N];

        for(int i=0;i<N;i++){
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
            P[i] = sc.nextInt();
            nowMin[i] = 10000001;
        }

        long ans=0;
        for(int i=0;i<N;i++){
            ans += Math.min(Math.abs(X[i]),Math.abs(Y[i])) * P[i];
            nowMin[i] =  Math.min(Math.abs(X[i]),Math.abs(Y[i]));
        }
        System.out.println(ans);

        for(int i=0;i<N;i++){
            long minAns = -1;
            long minNum = 100000000;
            for(int j = -10000;j<10001;j++){
                long tmpansNS =0;
                long tmpansWE =0;
                Map<Long,Integer> valMap = new HashMap();
                for(int k=0;k<N;k++){
                    int tmpMinNS = Math.min(nowMin[k],Math.abs(X[k]-j));
                    int tmpMinWE = Math.min(nowMin[k],Math.abs(Y[k]-j));
                    tmpansNS += tmpMinNS * P[k];
                    valMap.put(tmpansNS,j);
                    tmpansWE += tmpMinWE * P[k];
                    valMap.put(tmpansWE,j+100000);

                }
                if(minAns == -1){
                    minAns = Math.min(tmpansNS,tmpansWE);
                    minNum = valMap.get(minAns);
                } else {
                    if(minAns > Math.min(minAns,Math.min(tmpansNS,tmpansWE))){
                        minAns = Math.min(minAns,Math.min(tmpansNS,tmpansWE));
                        minNum = valMap.get(minAns);
                    }

                }

            }
            System.out.println(minAns);
            if(minNum > 50000){
                minNum -= 100000;
                for(int l=0;l<N;l++){
                    nowMin[l] = Math.min(Math.abs(Y[l]-(int)minNum),nowMin[l]);
                }
            } else {
                for(int l=0;l<N;l++){
                    nowMin[l] = Math.min(Math.abs(X[l]-(int)minNum),nowMin[l]);
                }
            }
        }


    }

}


