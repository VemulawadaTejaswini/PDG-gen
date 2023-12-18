import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int check = Character.getNumericValue(Integer.toString(x).charAt(0));
        if(100 * check <= x && x <= 105 * check) System.out.println(1);
        else System.out.println(0);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
