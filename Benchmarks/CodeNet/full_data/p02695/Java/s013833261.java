import java.util.*;
public class Main {
    static List<Integer> list = new ArrayList<>();//生成した数列を格納するためのリスト
    static long max = 0;
    static long d_sum = 0;
    static Scanner sc = new Scanner(System.in);  
    static int N = sc.nextInt();
    static int M = sc.nextInt();
    static int Q = sc.nextInt();
    static int A[][]=new int[Q+1][5];
    
    
    //main関数の定義
    public static void main(String[] args) {
        for(int i=1;i<=Q;i++){
            for(int k=1;k<=4;k++){
                A[i][k]=sc.nextInt();
            }
        }       
        dfs(list, N, M, Q);
        System.out.println(max);
    }
    
    //main関数から呼ばれる関数を定義する
    static void dfs(List<Integer> list, int N, int M, int Q){

        if(list.size()==N){
            //終了時に実施する処理はこちら
            d_sum=0;    
            for(int i=1;i<=Q;i++){
                if (
                list.get(A[i][2]-1)-list.get(A[i][1]-1) ==                    
                A[i][3]
                )
                {
                    d_sum = d_sum+A[i][4];
                }   
            }
            max=Math.max(max,d_sum);
            return;
            }
            else{
                int prev_last = ((list.size()==0) ? 1 : list.get(list.size()-1));
                //
                for(int i=prev_last;i<=M;i++){
                    list.add(i);
                    dfs(list, N, M, Q);
                    list.remove(list.size()-1);
                }
            }           
        //}

    }
}