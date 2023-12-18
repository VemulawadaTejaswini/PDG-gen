import java.util.*;
public class Main {
    
    static Set<Integer> s = new HashSet<Integer>();
    
    // Well i knew this. But just thought it would make no performance gain 
    // over the string solution
    static void solve(){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt(), NOC = sc.nextInt();
        while(NOC-->0) s.add(sc.nextInt());
        for(int i = start; i<10000; i++){
            boolean end = true; 
            int n = i;
            while(n>0) {
                if(s.contains(n%10)) { end = false; break; }
                n=(n/10);
            }
            if(end) { System.out.println(i); break; }
        }
        sc.close();
    }
    
    public static void main(String args[]) {
        solve();
    }
}