import java.util.*;
public class Main {
    
    static Set<Integer> m = new HashSet<Integer>();

    // Fails few test cases, but lets see if passes others
    static void solve(){
        Scanner sc = new Scanner(System.in);
        sc.nextInt(); int NOC = sc.nextInt(), n=NOC, count=0;
        boolean removeOne = true;
        m.add(1);
        while (NOC-->0) {
            int s = sc.nextInt(), e = sc.nextInt();
            if(e==1) removeOne=false;
            if(m.contains(s)) {
                if(removeOne) { m.remove(1); removeOne=false; }// Special case   
                if(!m.contains(e)) m.add(e);
                else m.remove(s);
            }
        }
        System.out.println(m.size());
        sc.close();
    }

    public static void main(String args[]) {
        solve();
    }
}   
