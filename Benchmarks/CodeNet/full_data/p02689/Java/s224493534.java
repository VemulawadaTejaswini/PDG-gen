import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] h = new int[n];
        boolean[] judge = new boolean[n];
        int ans = 0;
        for (int i = 0 ; i <n ; i++){
            h[i]= scan.nextInt();
        }
        for (int i = 0 ; i <m ; i++){
            int a = scan.nextInt()-1;
            int b = scan.nextInt()-1;
            if (h[a]<=h[b]){
                judge[a] = true;
            }
            if (h[a]>=h[b]){
                judge[b] = true;
            }
        }
        for (int i = 0; i<judge.length ; i++){
            if (!judge[i]){
                ans ++;
            }
        }
        System.out.println(ans);
            }
        }