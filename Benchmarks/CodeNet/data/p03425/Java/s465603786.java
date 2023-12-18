import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Map<String, Integer> m = new HashMap<>();

        for(int i=0; i<n; i++){
            String s = scan.next().substring(0, 1);
            if(!s.matches("[MARCH]")) continue;
            if(!m.containsKey(s)) m.put(s, 1);
            else m.put(s, m.get(s)+1);
        }
        int ans = 0;
        if(m.size() >= 3){
            Object[] keys = m.keySet().toArray();
            for(int i=0; i<keys.length-2; i++){
                for(int j=i+1; j<keys.length-1; j++){
                    for(int k=j+1; k<keys.length; k++){
                        ans += (m.get(keys[i]) * m.get(keys[j]) * m.get(keys[k]));
                    }

                }
            }
        }
        System.out.println(ans);
        scan.close();
    
    }

}