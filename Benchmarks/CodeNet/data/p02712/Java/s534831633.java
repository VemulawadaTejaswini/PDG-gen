    import java.util.*;
         
    class Main{
        public static void main(String[] args) {
            
            try(Scanner sc = new Scanner(System.in)){
                int n = Integer.parseInt(sc.next());
     
                long sum = (n * (1 + n)) / 2;
                int baisu3 = (n - (n % 3)) / 3;
                int baisu5 = (n - (n % 5)) / 5;
                int baisu15 = (n - (n % 15)) / 15;
              
                long sum3 = (baisu3 * (3 + 3 * baisu3)) / 2;
                long sum5 = (baisu5 * (5 + 5 * baisu5)) / 2;
                long sum15 = (baisu15 * (15 + 15 * baisu15)) / 2;
     
                long ans = sum - sum3 - sum5 + sum15;
     
                System.out.println(ans);
                
            }catch(Exception e){
                e.printStackTrace();
            }        
        }
    }