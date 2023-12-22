import java.util.*;
public class Main{
  
 public static void main(String[] args){
  
   Scanner sc = new Scanner(System.in);
   
     /*K倍*/
     int k = sc.nextInt();
     int a = sc.nextInt();
     int b= sc.nextInt();
   
   int seisu;
   int count = 0;
   for(int i=1;i<=1000;i++){
     
     if(i%k == 0){ 
       seisu = i/k;
       
       if((a <= seisu) && (seisu <= b)){
         count++;    
         break;
       }
     }
   }
     
   if(count>0){
     System.out.println("OK");
   }else{
      System.out.println("NG");     
    }
 }
 }
   