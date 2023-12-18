import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int k = scan.nextInt();
        ArrayList<Integer> out = new ArrayList<>();
        for(int i = a; i < Math.min(a + k, b); i++) out.add(i);
        for(int i = Math.max(a, b - k + 1); i <= b; i++) if(!out.contains(i)) out.add(i);
        for(int i : out) System.out.println(i);
        scan.close();
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
