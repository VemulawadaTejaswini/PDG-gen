import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String N = sc.next();
   long K = sc.nextInt();
   int tmp =0;
   String tmpS = "1";
   
   while(101>tmp)
   {
     if(!N.substring(tmp,tmp+1).equals("1"))
     {
       tmpS = N.substring(tmp,tmp+1);
       break;
     }
     tmp++;
   }
   
   System.out.println(tmpS);
 }
}