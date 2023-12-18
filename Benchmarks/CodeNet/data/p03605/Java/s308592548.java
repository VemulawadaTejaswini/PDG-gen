import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
      
      if(a>=90){
       System.out.print("Yes"); 
      }else{
       for(int s = 9; s<100 ; s+=10) {
         if(s==a){
           System.out.print("Yes"); 
         }
       }
         
      }
      
    }
}