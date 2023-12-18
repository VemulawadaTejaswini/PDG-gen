import java.util.*;

/**
 * Created by kame on 2018/06/03.
 */
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int L[]=new int[N];
        int R[]=new int[N];
        for(int i=0;i<N;i++){
            L[i]=sc.nextInt();
            R[i]=sc.nextInt();
        }
        Arrays.sort(L);
        Arrays.sort(R);
        boolean frag=Math.abs(R[0])>Math.abs(L[N-1]);//trueの時右側からスタート
        if(Math.abs(R[0])>Math.abs(L[N-1])){

        }
        int nowPos=0;
        long result=0;
        for(int i=0;i<N/2;i++){
            if(frag){
                if(R[i]<nowPos){
                    result+=-R[i]+nowPos;
                    nowPos=R[i];
                }
                if(L[N-i-1]>nowPos) {
                    result += L[N - i - 1] - nowPos;
                    nowPos = L[N - i - 1];
                }
            }else{
                if(L[N-i-1]>nowPos) {
                    result += L[N - i - 1] - nowPos;
                    nowPos = L[N - i - 1];
                }
                if(R[i]<nowPos){
                    result+=-R[i]+nowPos;
                    nowPos=R[i];
                }
            }
        }
        System.out.println(result+Math.abs(nowPos));

    }
    Main(){

    }
}
