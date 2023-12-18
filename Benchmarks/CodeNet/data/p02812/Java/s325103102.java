import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        int ans = 0;

        for(int n=0; n<N-2; n++) if(S.substring(n, n+3).equals("ABC")) ans++;
        System.out.println(ans);
    }

}
