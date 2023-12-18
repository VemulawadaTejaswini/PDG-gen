import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        List<Integer> numOfMonster = new ArrayList<Integer>();
        List<Integer> manPowerOfMan = new ArrayList<Integer>();
        
        int result = 0;
        for (int index = 0 ; index <= n ; index++) {
          numOfMonster.add(scanner.nextInt());
        }
        for (int index = 0 ; index < n ; index++) {
          manPowerOfMan.add(scanner.nextInt());
        }
        
        while(manPowerOfMan.size() > 0) {
          result+=headAndTail(numOfMonster,manPowerOfMan);
        }
        
        System.out.println(result);
    }
    
    
    private static int headAndTail (List<Integer> mons, List<Integer> manPower) {
      int length = manPower.size();
      if (length==1) {
        int result = Math.min(mons.get(0)+mons.get(1), manPower.get(0));
        manPower.remove(0);
       
        return result;
      } else {
        //head
        int result = 0;
        if(mons.get(0) < manPower.get(0)) {
           result += mons.get(0);
          int remainManPower = manPower.get(0)-mons.get(0);
          if(mons.get(1) <remainManPower) {
            result += mons.get(1);
            mons.set(1,0);
          } else {
            result += remainManPower;
            mons.set(1, mons.get(1)-remainManPower);
          }
        } else {
          result+= manPower.get(0);
        }
        
        int monsTail = mons.size()-1;
        int manTail = manPower.size()-1;
        //tail
        if(mons.get(monsTail) < manPower.get(manTail)) {
          result += mons.get(monsTail);
         int remainManPower = manPower.get(manTail)-mons.get(monsTail);
         if(mons.get(monsTail-1) <remainManPower) {
           result += mons.get(monsTail-1);
           mons.set(monsTail-1,0);
         } else {
           result += remainManPower;
           mons.set(monsTail-1, mons.get(monsTail-1)-remainManPower);
         }
       } else {
         result+= manPower.get(manTail);
       }
        mons.remove(monsTail);
        manPower.remove(manTail);
        mons.remove(0);
        manPower.remove(0);
        
        return result;
      }
      
    }
}
