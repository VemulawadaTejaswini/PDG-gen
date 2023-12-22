import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            long n = Long.parseLong(sc.next());
            Map<Long, Integer> prime = new HashMap<>(); 

            int ans = 0;

            if(n == 1) System.out.println(ans);
            else{
                boolean isFirst = true;
                while(n%2 == 0){
                    n /= 2;
                    if(isFirst){
                        prime.put((long)2, 1);
                        isFirst = false;
                    }else{
                        prime.replace((long)2, prime.get(2) + 1);
                    }
                }
                
                long devide = 3;
                while(n != 1){
                    if(n%devide == 0){
                        if(!prime.containsKey(devide)) prime.put(devide, 1);
                        else prime.replace(devide, prime.get(devide) + 1); 
                        n /= devide;
                    }else{
                        devide += 2;
                    }
                }

                for(Integer value: prime.values()){
                    if(value == 1){
                        ans += 1;
                    }else{
                        int minus = 1;
                        while(value >= minus){
                            value -= minus;
                            ans++;
                            minus++;
                        }
                    }
                }    

            }

            System.out.prinln(ans);
            
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}