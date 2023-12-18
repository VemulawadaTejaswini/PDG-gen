import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();   //人数
        m = sc.nextInt();   //種類数

        int count[] = new int[m+1];
        for(int i=0; i<n; i++){
            int k = sc.nextInt();   //好きな種類数
            for(int j=0; j<k; j++){
                int a = sc.nextInt();   //種類番号
                count[a]++;
            }
        }

        int cnt = 0;
        for(int i=1; i<=m; i++){
            if(count[i] == n) cnt++;
        }
        System.out.println(cnt);
    }
}