import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0 && (s.charAt(i) != 'R' && s.charAt(i) != 'U' && s.charAt(i) != 'D')){
                System.out.println("No");
                return;
            }
            if(i % 2 != 0 && (s.charAt(i) != 'L' && s.charAt(i) != 'U' && s.charAt(i) != 'D')){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
