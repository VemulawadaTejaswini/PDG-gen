import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] l = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            l[i] = Integer.parseInt(sc.next());
            map.put(l[i], map.getOrDefault(l[i], 0) +1);
        }
        
        int ans = 0;
        Set<Integer> set = map.keySet();
        List<Integer> list = new ArrayList<>(set);
        int[] y = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            y[i] = list.get(i);
        }
        int yl = y.length;
        
        for(int a = 0; a < yl-2; a++){
            for(int b = a+1; b < yl-1; b++){
                for(int x = 0; x < yl-1-b; x++){
                    int c = b+1+x;
                    if(y[a]<y[b]+y[c] && y[b]<y[c]+y[a] && y[c]<y[a]+y[b]){
                        ans += map.get(y[a]) * map.get(y[b]) * map.get(y[c]);
                    }
                }
            }
        }
        
        System.out.println(ans);
    }
}