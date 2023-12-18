import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)) count++;
            else count = 1;
            if(count >= 3){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
