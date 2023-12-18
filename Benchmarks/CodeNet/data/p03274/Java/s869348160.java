import java.util.*;
class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int l, r, score, ans=Integer.MAX_VALUE;
        for (int i=0; i<n-k+1; i++){
            l = arr[i];
            r = arr[i+k-1];
            if (l<0 && r>=0){
                l = Math.abs(l);
                score = Math.max(l, r) + 2*Math.min(l, r);
            }else{
                l = Math.abs(l);
                r = Math.abs(r);
                score = Math.max(l, r);
            }
            ans = Math.min(ans, score);
        }
        System.out.println(ans);
    }
}