import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sp = s.split("");
        int[] n = new int[4];
        String ans = "No";
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<4; i++) {
            n[i] = Integer.parseInt(sp[i]);
            if(map.containsKey(n[i])) map.put(n[i], map.get(n[i])+1);
            else map.put(n[i], 1);
        }
        for(int i=0; i<4; i++) {
            if(map.get(n[i]) >= 3) {
                ans = "Yes";
                break;
            }
        }
        
        System.out.println(ans);
    }
}