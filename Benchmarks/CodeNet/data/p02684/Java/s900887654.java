
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int[] time = new int[n];    //何回目に初めてその町に到達したかを示す 町番号は箱の番号+1
        time[0] = 0;
        int now = 0;
        for(int i=1;;i++){
            if(time[a[now] - 1] != 0){  //来たことがある場合
                int loop = i - time[a[now] - 1];
                k -= (k - i) / loop * loop;
                time = new int[n];
            }else {
                time[a[now] - 1] = i;
            }
            now = a[now] - 1;
            if(i == k){
                break;
            }
        }
        now++;
        System.out.println(now);
    }
}
