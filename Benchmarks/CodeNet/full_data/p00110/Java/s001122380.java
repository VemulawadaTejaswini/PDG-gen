import java.util.*;

public class Main{
    Scanner in = new Scanner(System.in);

    void solve(){
        String s;
        while(in.hasNextLine()){
            s = in.nextLine();
            calc(s);
        }
    }
    void calc(String str){
        String a = str.substring(0, str.indexOf('+'));
        String b = str.substring(str.indexOf('+') + 1, str.indexOf('='));
        String c = str.substring(str.indexOf('=') + 1);
        for(int i = 0; i < 10; i++){
            String left = sum(a, b, i);
            String right = c.replace("X", String.valueOf(i));
            if(left.equals(right)){
                System.out.println(i);
                return;
            }
        }
        System.out.println("NA");
    }

    String sum(String a, String b, int rep){
        StringBuilder ans  = new StringBuilder();
        a = new StringBuilder(a.replace("X", String.valueOf(rep))).reverse().toString();
        b = new StringBuilder(b.replace("X", String.valueOf(rep))).reverse().toString();

        int t = 0;
        for(int i = 0; i < Math.max(a.length(), b.length()); i++){
            int x = i < a.length() ? a.charAt(i) - '0' : 0;
            int y = i < b.length() ? b.charAt(i) - '0' : 0;
            ans.append(String.valueOf((x + y + t) % 10));
            t = (x + y + t) / 10;
        }

        if(t != 0){
            ans.append(String.valueOf(t));
        }

        return ans.reverse().toString();
    }
    
    public static void main(String[] args){
        new Main().solve();    
    }
}