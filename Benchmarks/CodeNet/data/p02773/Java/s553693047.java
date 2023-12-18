import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap <String,Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<N; i++){
            String tmp = sc.next();
            
            if(map.containsKey(tmp)){
                map.put(tmp,map.get(tmp)+1);
            }else{
                map.put(tmp,1);
            }
        }
        
        int max = 0;
        for(String key : map.keySet()){
            if(map.get(key)>max){
                max = map.get(key);
            }
        }   
        
        for(String key : map.keySet()){
            if(max == map.get(key)){
                list.add(key);
            }
        }
        
        Collections.sort(list);
        
        for(String str : list){
            System.out.println(str);    
        }
    }
}