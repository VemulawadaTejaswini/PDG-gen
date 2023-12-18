import java.util.*;
//System.out.println("")

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            cnt = cnt + min(a*2,(K-x[i])*2);
        }
        System.out.println(cnt);
    }
}