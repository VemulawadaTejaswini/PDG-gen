import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] m = new int[n];
        int mmax = 0;
        int ans = n;
        for(int i = 0;i < n;i++){
            m[i] = sc.nextInt();
            mmax += m[i];
        }
        x -= mmax;
        Arrays.sort(m);
        while(x >= m[0]){
            x -= m[0];
            ans++;
        }
        System.out.println(ans);
    }
}