import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        Arrays.sort(A);
        int ans = Integer.MAX_VALUE;
        for(int i=A[0];i<=A[N-1];i++){
            ans = Math.min(ans,help(A,i));
        }
        System.out.println(ans);
    }
    static int help(int[] a, int tar){
        int ans=0;
        for(int i=0;i<a.length;i++){
            ans += (a[i]-tar)*(a[i]-tar);
        }
        return ans;
    }
}
