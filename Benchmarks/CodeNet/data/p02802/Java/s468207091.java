import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet<Integer> ac = new HashSet<Integer>();
        HashMap<Integer,Integer> wa = new HashMap<Integer,Integer>();
        for(int i = 0; i < m; i++){
            int num = sc.nextInt();
            String s = sc.next();
            if(s.equals("AC")){
                ac.add(num);
            }else{
                if(ac.contains(num)){
                    continue;
                }else{
                    if(wa.containsKey(num)){
                        wa.put(num,wa.get(num)+1);
                    }else{
                        wa.put(num,1);
                    }
                }
            }
        }
        int was = 0;
        for(Map.Entry<Integer,Integer> entry : wa.entrySet()){
            if(ac.contains(entry.getKey())){
                was += entry.getValue();   
            }
		}
        System.out.print(ac.size() + " ");
        System.out.println(was);
    }
}