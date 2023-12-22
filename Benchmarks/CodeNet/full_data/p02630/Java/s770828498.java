import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            int numLine = Integer.parseInt(sc.next());
            Map<Integer, Integer> aMap = new HashMap<>();
            
            long ans = 0;
            for(int i = 0; i < numLine; i++){
                int a = Integer.parseInt(sc.next());
                ans += a;
                if(!aMap.containsKey(a)) aMap.put(a, 1);
                else aMap.replace(a, aMap.get(a) + 1);
            }

            int query = Integer.parseInt(sc.next());

            for(int i = 0; i < query; i++){
                int b = Integer.parseInt(sc.next());
                int c = Integer.parseInt(sc.next());

                if(!aMap.containsKey(b)){
                    System.out.println(ans);
                }else{
                    ans += aMap.get(b) * (c - b);
                    System.out.println(ans);

                    if(!aMap.containsKey(c)){
                        aMap.put(c, aMap.get(b));
                        aMap.remove(b);
                    }else{
                        aMap.replace(c, aMap.get(c) + aMap.get(b));
                        aMap.remove(b);
                    }
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}