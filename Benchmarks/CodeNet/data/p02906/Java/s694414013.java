import java.util.*;

public class Main{
    public static void main(String[] args){
    //入力
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int M =sc.nextInt();
        int Q =sc.nextInt();
        int s = 0;
        int[] solo = new int[N];
        for(int i=0;i<N;i++){
            solo[i] = -1;
        }
        for(int i=0;i<Q;i++){
            int t = sc.nextInt();
            int tt = sc.nextInt();
            int ttt = sc.nextInt();
            if(ttt==0){

                if(solo[t]==-1){
                    if(solo[t]==0){s = 1;}
                solo[t] = 0;
            }
                if(solo[tt]==-1){
                    if(solo[tt]==0){s = 1;}
                    solo[tt] = 0;
                }
            }
            else{
                solo[t] = 1;
                solo[tt] = 1;
            }
        }
    //処理
        int a=0;
        int b=0;
        int c=0;
        boolean ans = false;
        for(int i=0;i<N;i++){
            if(solo[i]==1){a++;}
            if(solo[i]==0){b++;}
            if(solo[i]==-1){c++;}
        }
        int E = M - b;
        N = a + c;
        if(3 <= a+c&&s==0){
            for(int i=0;i<=b;i++){
                if((long)(E-i)<=((long)(N-i)*(long)(N-i-1)/2L)){
                    if(N-i != 2){ans = true;}
                }
            }
        }
        System.out.println((ans)?"Yes":"No");
    }
}
