import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        TreeSet<String> s = new TreeSet<>();
        for(int i = 0; i < n; i++) s.add(scan.next());
        System.out.println(s.size());
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
