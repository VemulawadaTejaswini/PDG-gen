import java.util.*;
class Main{
    public static void main(String[] args){
        // ----------入力-------------//
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();           // 展望台の数
        int M = sc.nextInt();           // 道の数

        // ---展望台の高さを記憶---//
        int[] height = new int[N];      // 展望台の高さ
        for(int i=0;i<N;i++){
            height[i] = sc.nextInt();
        }
        //-------良い展望台を識別するフラグ good を用意--------//
        boolean[] good = new boolean[N];    //良い展望台のときtrue
        Arrays.fill(good, true);            // trueで初期化
        // ---道が入力されるたびに比較を行い，低い方はgoodフラグを下ろす---//
        int a,b;                // 道がつなぐ二つの展望台
        for(int j=0;j<M;j++){
            a = sc.nextInt() -1;   // 一つ目の展望台
            b = sc.nextInt() -1;   // 二つ目の展望台
            if(height[a]==height[b]){
                // 何もしない
            }
            else if(height[a]<height[b]){   // aが低い時，aのフラグを下ろす
                good[a]=false;
            }
            else{                               // bが低い時，bのフラグを下ろす
                good[b]=false;
            }
        }
        // ---------出力-----------//
        int cnt=0;
        for(int k=0;k<N;k++){
            if(good[k]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}