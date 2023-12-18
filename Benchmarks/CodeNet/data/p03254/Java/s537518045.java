import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x= sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        int ans = 0;
        for(int i = 0; i < N; i++){
            //飴が全て配れなかった時ansを-1しないための処理
            if(x < a[i]){
                ans++;
                break;
            }
            else if(x > 0){
                x -= a[i];
                ans++;
            }
        }

        if(x == 0) System.out.println(N);
        else if(ans == 0) System.out.println("0");
        //全て配れて飴が余った時はans-1
        else if(x > 0) System.out.println(ans - 1);

    }
}
