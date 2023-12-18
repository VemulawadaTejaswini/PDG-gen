import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            int n = Integer.parseInt(sc.next());
            ArrayList<Integer> list = new ArrayList<>();

            int min = -1;
            int countMinus = 0;
            long sum = 0;

            for(int i = 0; i < n; i++){
                int addNum = Integer.parseInt(sc.next());
                if(addNum < 0) countMinus++;
                if(min == -1) min = Math.abs(addNum);
                else if (min > Math.abs(addNum)) min = Math.abs(addNum);
                list.add(addNum);
                sum += Math.abs(addNum);
            }

            if(countMinus % 2 == 0) System.out.println(sum);
            else System.out.println(sum - min);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}