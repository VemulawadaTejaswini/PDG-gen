import java.util.*;
public class B{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     
     int x = sc.nextInt();
     
     int happiness = (x/500) * 1000;
     x = x%500;
     happiness += (x/5)*5;
     
     System.out.println(happiness);
     
     
   }
}