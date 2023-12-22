import java.util.*;
public class Main {
    //変数定義
    static long [] SumB;
    static int M ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        M = sc.nextInt();
        long K = sc.nextLong();
        long A[] = new long[N+1];
        long B[] = new long[M+1];
        long SumA[] = new long[N+1];
        SumA[0]=0;
        SumB = new long[M+1];
        SumB[0]=0;
        long Remain = 0;
        int wk=0;
        int ans=0;

        for(int i=1;i<=N;i++){
            A[i]=sc.nextLong();

            SumA[i]=SumA[i-1]+A[i];
        }

        for(int j=1;j<=M;j++){
            B[j]=sc.nextLong();

            SumB[j]=SumB[j-1]+B[j];
        }


        outside:for(int i=1;i<=N;i++){
            Remain = K-SumA[i];
            if (Remain>0) {
                //にぶたん
                //二分探索

                wk=i+(binarysearch((int)Remain));

                ans=Math.max(wk,ans);

            }

            else{
                //終了
                if (Remain==0) {
                    wk=i;
                }
                else{
                    wk=i-1;
                }
                ans=Math.max(wk,ans);
                break outside;
            }
        }


        System.out.println(ans);


    }

    //関数定義二分探    
    public static int binarysearch(int key) {
        
        int left = 0;
        
        int right = SumB.length;
        
        while (right - left > 1) {
            
            int mid = left + (right - left) / 2;
            
            if (SumB[mid] > key){
            right = mid;
            
            }
            else{
            left = mid;
            } 
        }
    
        /* left は条件を満たさない最大の値、right は条件を満たす最小の値になっている */
        return left;
    }


}