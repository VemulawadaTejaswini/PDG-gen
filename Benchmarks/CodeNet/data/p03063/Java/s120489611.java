import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();

        int[] bnum = new int[n+1];
        bnum[0] = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '#'){
                bnum[i+1] = bnum[i] + 1;
            }else{
                bnum[i+1] = bnum[i];
            }
        }

        int ans = Integer.MAX_VALUE;

        if(bnum[n] == 0 || bnum[n] == n){
            System.out.println(0);
            return;
        }

        for(int i=0; i<n; i++){
            int mans = bnum[i+1];
            mans += (n - bnum[n]) - (i+1 - bnum[i]);
            ans = Math.min(ans, mans);
        }

        System.out.println(ans);
    }
}