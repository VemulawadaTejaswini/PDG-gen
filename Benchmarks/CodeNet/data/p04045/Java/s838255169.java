import java.util.*;
public class Main {
    
    static Set<Integer> s = new HashSet<Integer>();
    
    // A bit weird hacky solution with strings
    // I wonder if there is an easier way to decompose the problem with math
    static void solve(){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt(), NOC = sc.nextInt();
        boolean end = false;
        while(NOC-->0) s.add(sc.nextInt());
        for(int i = start; i<10000; i++){
            for(char ch: (""+i).toCharArray()) {
                if(s.contains(Character.getNumericValue(ch))) { end = false; break; }
                else end = true;
            }
            if(end) { System.out.println(i); break; }
        }
        sc.close();
    }
    
    public static void main(String args[]) {
        solve();
    }
}