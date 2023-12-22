import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += Integer.parseInt(Character.toString(s.charAt(i)));
        }
        System.out.println(sum % 9 == 0 ? "Yes" : "No");
        scan.close();
    }

    public static void main(String[] args){
        new Main().solve();
    }
}