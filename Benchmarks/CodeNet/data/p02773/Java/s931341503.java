import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        ArrayList<String> ans = new ArrayList<String>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            if(map.containsKey(s)){
                
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }
        
        List<Map.Entry<String, Integer>> list_entries = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(list_entries, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> obj1, Map.Entry<String, Integer> obj2)
            {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        int cnt = 0;
        int max = 0;
        for(Map.Entry<String, Integer> entry : list_entries) {
            if(cnt == 0){
                cnt++;
                max = entry.getValue();
                ans.add(entry.getKey());
            }else if(max == entry.getValue()){
                cnt++;
                ans.add(entry.getKey());
            }
        }
        Collections.sort(ans);
        for(String s : ans){
            System.out.println(s);
        }
    }
}