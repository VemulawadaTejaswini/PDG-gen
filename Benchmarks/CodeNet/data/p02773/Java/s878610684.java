import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        TreeMap<String, Integer> S = new TreeMap<String, Integer>();               
        String tmp;
        int max = 1;
        int count;

        for(int i=0; i<N; i++){
            tmp = sc.next();
            
            if(S.containsKey(tmp)){
                count = S.get(tmp)+1;
                if(max < count){
                    max = count;
                }
                S.put(tmp,count);
            } else {
                S.put(tmp,1);
            }
            
            
        }
        for(Iterator<String> it = S.keySet().iterator();it.hasNext();){
            String result = it.next();

            if(S.get(result) == max){
                System.out.println(result);
            }
        }
        
    }
}
