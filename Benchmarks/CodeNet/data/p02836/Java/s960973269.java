import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int N = str.length();
        int ans = 0;
        
        for(int i=0; i<N/2; i++){
            if(str.charAt(i) != str.charAt(N-i-1)){
                ans++;
            }
            //System.out.println(i);
        }
        System.out.println(ans);
    }
}
