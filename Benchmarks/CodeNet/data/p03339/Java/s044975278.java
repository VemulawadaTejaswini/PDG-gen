import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int e = 0;
        int w = 0;
        for(int i = 1;i < N;i++)    if(S.charAt(i) == 'E')  e++;
        int ans = e;
        for(int i = 1;i < N;i++){
            if(S.charAt(i) == 'E')  e--;
            if(S.charAt(i-1) == 'W')    w++;
            ans = Math.min(ans, w+e);
        }
        System.out.println(ans);
    }
}