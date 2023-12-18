import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //3 ~ 1000
        int N = sc.nextInt();
        int[][] S = new int[N][N-1];
        for(int i=0;i<N;i++){for(int j=0;j<N-1;j++){S[i][j]=sc.nextInt()-1;}}
        int[] P = new int[N];
        int[] T = new int[N];
        int opp = 0;
        int temp = 0;
        int day = 1;
        for (int i=0;i<N;i++){
            P[i]=-1;
            T[i]=0;
        }
        while(day >= 0){
            //初期化
            temp =0;
            for (int i=0;i<N;i++){T[i]=0;}
            //早い順に削っていく
            for(int i=0;i<N;i++){
                //まずは、その選手がその日に試合を終えていないか、或いはもう全試合を終えているかを判定
                if(T[i]==0&&P[i]!=N-2){
                    opp = S[i][P[i]+1];
                    //相手の試合が終わっていないかを判定、相手が全試合を終えていることはありえない。
                    if(T[opp]==0){
                        //相手の試合相手が自分になるかを判定
                        if(i==S[opp][P[opp]+1]){
                            //試合を行い、進度を増やす
                            P[i] += 1;
                            P[opp]+= 1;
                            //その日に試合済みであることを記録
                            T[i] =1;
                            T[opp] = 1;
                            //その日に試合をした人がいたことを記録;
                            temp = 1;
                            //デバッグ用
                            //System.out.println(i +"vs" +opp);
                        }
                    }
                }
            }
            //誰も試合ができなかった場合、ループを終わる
            if (temp==0){
                //この時、全員の試合が終わっているのか、組み合わせの都合でできないのかを区別
                temp = 1;
                for (int i=0;i<N;i++){if(P[i]!=N-2){temp*=0;}}
                if(temp == 0){
                    day = -1;
                    break;
                }
                else{
                    //余計な一日を引く
                    day -= 1; 
                    break;
                }
            }
            //日付を増やす
            day += 1;
        }
        System.out.println(day);
        sc.close();
    }
}