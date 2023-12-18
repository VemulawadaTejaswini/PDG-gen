import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        char c[] = s.toCharArray();
        int a[] = new int[n];
        for(int i=0;i<n;i++)a[i] = c[i] - '0';
        sc.close();

        if(a[0]==0||a[n-1]==1){
            System.out.println(-1);
            return;
        }

        for(int i=1;i<n-1;i++){
            if(a[i]!=a[n-2-i]){
                System.out.println(-1);
                return;
            }
        }

        int ans[][] = new int[n-1][2];
        ans[0][0] = 0; ans[0][1] = 1;
        for(int i=1;i<n-1;i++){
            if(a[i] == 0){
                ans[i][0] = ans[i-1][0];
            }
            else{
                ans[i][0] = ans[i-1][1];
            }
            ans[i][1] = i+1; 
        }
        for(int i=0;i<n-1;i++){
            int from = ans[i][0] + 1, to = ans[i][1] + 1;
            System.out.println(from + " " + to);
        }
        System.out.println();
    }
}