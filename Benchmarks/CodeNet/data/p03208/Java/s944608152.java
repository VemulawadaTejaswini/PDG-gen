import java.util.*;

public class Main {
    static HashSet<Integer> dic = new HashSet<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for(int i=0;i<n;i++) h[i]=sc.nextInt();
        Arrays.sort(h);
        int ans = Integer.MAX_VALUE;
        for(int i=0;i+k-1<n;i++){
            ans = Math.min(ans,h[i+k-1]-h[i]);
        }
        System.out.println(ans);
    }
}