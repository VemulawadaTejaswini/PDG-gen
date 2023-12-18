import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            int n = Integer.parseInt(sc.next());
            long k = Long.parseLong(sc.next());
            long kk = k;

            List<Integer> town = new ArrayList<>();
            town.add(0);

            Map<Integer, Integer> visit = new HashMap<>();

            int toGo = 0;
            boolean breakFlg = false;
            int breakNum = 0;

            for(int i = 1; i <= n; i++){
                int goTown = Integer.parseInt(sc.next());
                town.add(goTown);

                if(i == 1){
                    visit.put(0, 1);
                    toGo = goTown;
                    visit.put(visit.size(), toGo);
                }    

                while(i >= toGo && k != 0){
                    toGo = town.get(toGo);
                    k--;
                    if(!visit.containsValue(toGo)){
                        visit.put(visit.size(), toGo);
                    }else{
                        breakFlg = true;
                        breakNum = toGo;
                        break;
                    }
                }

                if(breakFlg || k == 0) break;
            } 

            if(k == 0) System.out.println(visit.get(visit.size() - 1));
            else{
                k = kk;
                int minusNum = 0;
                for(int i = 0; i < visit.size(); i++){
                    if(visit.get(i) == breakNum){
                        k -= i;
                        minusNum = i;
                        break;
                    }
                }
                long mod = k % (visit.size() - minusNum);
                System.out.println(visit.get((int)mod + minusNum));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}