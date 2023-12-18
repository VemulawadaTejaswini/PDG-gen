import java.util.*;
 
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        long hmn = sc.nextLong();
        
        long memo = 5;
        for(int i = 0;i < 5;i++ ){
         long now = sc.nextLong();
         if(now<hmn){
            hmn = hmn - now;
            memo += hmn;
         }
        }
        System.out.println(memo);
    }
}