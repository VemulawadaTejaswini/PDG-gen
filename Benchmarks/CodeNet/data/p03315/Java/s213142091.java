import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String S=sc.next();
        char[] s=S.toCharArray();
        int ans=0;
        for(int i=0;i<4;i++){
            if(s[i]=='-'){
              ans--;  
            }else{
                ans++;
            }
        }
        System.out.println(ans);
    }

}