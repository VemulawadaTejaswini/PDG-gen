import java.util.*;

public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b= sc.nextInt();
     
    
     int min= a*2;
     int max = a*4;
     if(b>max){
          System.out.println("No");
     }else if(b<min){
          System.out.println("No");
     }
     else {
     boolean  ok =false;
     for(int i = min;i<=max;i++){
         if(i%2==0){
             if(b==i){
                 ok=true;
                 break;
             }
         }
     }
     if(ok){
         System.out.println("Yes");
     }else{
         System.out.println("No");
     }
    }
        
    }
}