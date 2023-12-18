import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            long n = Integer.parseInt(sc.next());
            long m = Integer.parseInt(sc.next());

            if(n == 1 && m == 1){
                System.out.println(0);
            }else if(n == 1){
                System.out.println(m - 2);
            }else if(m == 1){
                System.out.println(n - 2);
            }else if(n == 2 || m == 2){
                System.out.println(0);
            }else if(n > 2 && m > 2){
                System.out.println((n - 2)*(m - 2));
            }

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}