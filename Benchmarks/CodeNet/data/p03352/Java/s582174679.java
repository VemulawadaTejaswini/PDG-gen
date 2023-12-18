import java.util.*;
class Main{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
       
        int n =scan.nextInt();
        int count = 0;
        for(int i = n ; i >=1 ; i--){
            if(Math.sqrt(i) - (int)Math.sqrt(i)==0){
                System.out.println(i);
                break ;
            }          
        }
      
     }
}