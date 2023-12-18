import java.util.*;
class Main {
    static int[] a, b;
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        a = new int[N+1];
        int cnt = 0;
        for(int i = 1; i<N+1; i++) {
            a[i] = sc.nextInt();
        }
        b = new int[N+1];
        for(int i = 1; i<N+1; i++) b[i] = -1;
        for(int j = N; j>=1; j--) {
            if((a[j] == 1 && isOdd(j)) || (a[j] == 0 && !isOdd(j))) {
                if(b[j]==-1 ||b[j]==0) b[j] = 0;
                else {
                    System.out.println(-1);
                    return;
                }
            }
            else if((a[j] == 0 && isOdd(j))|| (a[j] == 1 && !isOdd(j))) {
                if(b[j]==-1 ||b[j]==1) {
                    if(b[j] == -1)cnt++;
                    b[j] = 1;
                    //System.out.println(j +" "+ isOdd(j));
                }
                else {
                    System.out.println(-1);
                    return;
                }
            }

        }
        System.out.println(cnt);
        for(int i = 1; i<N+1; i++) if(b[i]==1)System.out.println(i);
    }
    public static boolean isOdd(int j) {
        boolean cnt = false;
        for(int i = j*2; i<N+1; i=i+j) {
            if(b[i] == 1)cnt = !cnt;
        }
        return cnt;
    }
}