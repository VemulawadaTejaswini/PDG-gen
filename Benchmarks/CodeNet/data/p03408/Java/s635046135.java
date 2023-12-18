import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.HashMap;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	HashMap<String, Integer> hs = new HashMap();
      	int n = sc.nextInt();
      	sc.nextLine();
      	String s;
        int a;
      	while(n-- > 0){
            s = sc.nextLine();
            if(hs.containsKey(s)){
            	a = hs.get(s);
                hs.replace(s, a+1);
            }else{
                hs.put(s, 1);
            }
        }
        
        int m = sc.nextInt();
        sc.nextLine();
        while(m-- > 0){
            s = sc.nextLine();
            if(hs.containsKey(s)){
            	a = hs.get(s);
                hs.replace(s, a-1);
            }else{
                hs.put(s, -1);
            }
        }
        
        ArrayList<Integer> res = new ArrayList();
        hs.forEach((k,v) -> res.add(v));
        Collections.sort(res, new Comparator<Integer>(){
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1.compareTo(o2)*-1;
                }
            
        });
        
        a = res.get(0);
        System.out.println(a < 0 ? 0 : a);
    }
}