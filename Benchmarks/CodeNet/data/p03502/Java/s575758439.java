import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String n = sc.next();
   Boolean flg;
   //add per Keta
   int total = 0;
   for(int i = 0; i < n.length(); i++){
     total += Character.getNumericValue(n.charAt(i));
     //System.out.println(n.charAt(i));
   }
   //System.out.println(total);
   
   if((Integer.parseInt(n) % total ) == 0){
       flg = true;
   }else{
       flg = false;
   }
   
   if(flg == true){
    System.out.print("Yes"); 
   }else{
     System.out.print("No");
   }
 }
}