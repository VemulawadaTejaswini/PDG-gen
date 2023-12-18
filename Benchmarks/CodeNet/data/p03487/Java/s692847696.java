import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int count = 0;
        int[] m = new int[N+1];
        for(int i=0;i<N; i++){
            a[i] = sc.nextInt();
            if(a[i]>N) count++;
            else{
                m[a[i]]++;
            }
        }
        for(int i=1;i<=N;i++){
            if(m[i]==0) continue;
            if(m[i]<i) count += m[i];
            else count += m[i]-i;
        }
        System.out.println(count);
    }
}