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

            Map<Integer, Integer> visitList = new HashMap<>();
            Map<Integer, Integer> visit = new HashMap<>();

            int toGo = 0;
            boolean breakFlg = false;
            int breakNum = 0;

            for(int i = 1; i <= n; i++){
                int goTown = Integer.parseInt(sc.next());
                town.add(goTown);

                if(i == 1){
                    visitList.put(1, 0);
                    visit.put(0, 1);
                    toGo = goTown;
                    visitList.put(toGo, visit.size());
                    visit.put(visit.size(), toGo);
                }    

                while(i >= toGo && k != 0){
                    toGo = town.get(toGo);
                    k--;
                    if(!visit.containsValue(toGo)){
                        visitList.put(toGo, visit.size());
                        visit.put(visit.size(), toGo);
                    }else{
                        breakFlg = true;
                        breakNum = toGo;
                        break;
                    }
                }

                if(breakFlg || k == 0) break;
            } 

            if(k == 0 && breakFlg) System.out.println(breakNum);
            else if(k == 0 && !breakFlg) System.out.println(visit.get(visit.size() - 1));
            else{
                int minusNum = visitList.get(breakNum);
                k = kk - minusNum;
                long mod = k % (visit.size() - minusNum);
                System.out.println(visit.get((int)mod + minusNum));
            }

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}