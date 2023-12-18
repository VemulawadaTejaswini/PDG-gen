import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char[] c = new char[s.length()];
        for(int i = 0; i < s.length(); i++) c[i] = s.charAt(i);
        Arrays.sort(c);
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            if(c[i] == c[i - 1]) count++;
        }
        System.out.println(count >= 3 ? "Yes" : "No");
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
