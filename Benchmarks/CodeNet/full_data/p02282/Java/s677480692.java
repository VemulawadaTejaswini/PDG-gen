
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static int n;
    static List<Integer> post,ord,pre;
    static int pos;
    
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        post = new ArrayList<>();
        ord = new ArrayList<>();
        pre = new ArrayList<>();
        for(int i = 0; i< n; i++) post.add(sc.nextInt());
        for(int i = 0; i< n; i++) ord.add(sc.nextInt());
        solve();


    }
    static void rec(int l, int r){
        if( l >= r) return;
        
        int root = post.get(pos++);
        int m = ord.indexOf(root);
        
        rec(l,m);
        rec(m+1,r);
        
        pre.add(root);
        

        
    }
    
    static void solve(){
        pos = 0;
        rec(0,post.size());
        String out = "";
        for(int i: pre){
            out += i + " ";
        }
        System.out.println(out.trim());
        
    }

}

