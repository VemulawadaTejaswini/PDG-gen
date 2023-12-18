import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int x = 0;
        int y = 0;
        String s = scan.next();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'N') y++;
            else if(s.charAt(i) == 'E') x++;
            else if(s.charAt(i) == 'S') y--;
            else x--;
        }
        if(x == 0 && y == 0) System.out.println("Yes");
        else System.out.println("No");
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
