import java.util.Scanner;

public class Main{

 public static void main(String[] args){
  
   Scanner sc = new Scanner(System.in);
   
   int n = sc.nextInt();
   
   int m = sc.nextInt();
   
   int count = 0;
   
   int all = 0;
   
   String yon = "";
   
   int[] array = new int[n];
   
   for (int i = 0; i<array.length; i++){
    
     array[i] = sc.nextInt();
     
     all += array[i];
     
   }
   
   for(int i:array){
    
    if(i >= all*1/(4*m)){
      
      count += 1;
  	
    }
     
   }
   
   if(count >= m){
     
     yon = "Yes";
   
   }else{
     
     yon = "No";
     
   }
   
   System.out.println(yon);
   
 }
  
  
  
  
}  