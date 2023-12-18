import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Map<Character, Integer> init = new HashMap<Character, Integer>();
        Map<Character, Integer> count = new HashMap<Character, Integer>();
        
        String s = in.next();
        int f = -1, l = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!init.containsKey(c)){
                init.put(c, i);
                count.put(c, 1);
            }
            else{
                count.put(c, count.get(c) + 1);
                int len = i - init.get(c) + 1;
                if(count.get(c) > len/2.0 && len > 1){
                    f = init.get(c) + 1;
                    l = i + 1;
                    break;
                }
            }
        }
        if(f == -1){
            System.out.println("-1 -1");
        }
        else{
            System.out.println(f + " " + l);
        }
    }
}
