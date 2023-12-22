import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] masu = new int[N];
        int[] sai = new int[M];
        int ans = 0;
        int basho=0;
        for(int i=0;i<N;i++){
            masu[i]=Integer.parseInt(sc.next());
        }
        for(int i=0;i<M;i++){
            sai[i]=Integer.parseInt(sc.next());
        }
        int i=0;
        while(basho<N-1){
            ans++;
            basho+=sai[i];
            i++;
            if(basho>=N-1){
                break;
            }
            basho+=masu[basho];
        }
        System.out.println(ans);
    }
}