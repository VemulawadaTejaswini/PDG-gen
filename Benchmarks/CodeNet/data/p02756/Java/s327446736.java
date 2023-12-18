import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        s.append(scan.next());
        int q = scan.nextInt();
        for(int i = 0; i < q; i++){
            int t = scan.nextInt();
            if(t == 1){
                s.reverse();
            }else{
                int f = scan.nextInt();
                char c = scan.next().charAt(0);
                if(f == 1){
                    s.reverse();
                    s.append(c);
                    s.reverse();
                }else{
                    s.append(c);
                }
            }
        }
        System.out.println(s.toString());
    }


    public static void main(String[] args){
        new Main().solve();
    }
}
