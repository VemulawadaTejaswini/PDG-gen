import java.util.*;

public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b= sc.nextInt();
     
     int min= a*2;
     int max = a*4;
     boolean  ok =false;
     for(int i = min;i<=max;i++){
         if(min%2==0){
             if(i==b){
                 ok=true;
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