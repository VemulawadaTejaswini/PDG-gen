import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> blue = new HashMap<>();
        HashMap<String,Integer> red = new HashMap<>();
        HashSet<String> items = new HashSet<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            if(blue.containsKey(s)){
                blue.put(s,blue.get(s)+1);
            }else{
                blue.put(s,1);
                items.add(s);
            }
        }
        int m = sc.nextInt();
        for(int i = 0; i < m; i++){
            String s = sc.next();
            if(red.containsKey(s)){
                red.put(s,red.get(s)+1);
            }else{
                red.put(s,1);
                items.add(s);
            }
        }
        int ans = 0;
        for(String i: items){
            int b = blue.containsKey(i) ? blue.get(i) : 0;
            int r = red.containsKey(i) ? red.get(i) : 0;
            ans = Math.max(ans,b-r);
        }
        System.out.println(ans >= 0 ? ans : 0);
    }
}
