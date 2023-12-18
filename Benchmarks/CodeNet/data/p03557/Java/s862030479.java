import java.util.*;

class Main{            
     
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);  
       
       int n = sc.nextInt();
       
       long a[] = new long[n];
       for(int i = 0;i < n;i++){
           a[i] = sc.nextLong();
       }
       
       long b[] = new long[n];
       
       for(int i = 0;i < n;i++){
           b[i] = sc.nextLong();
       }
       
       long c[] = new long[n];
       
       for(int i = 0;i < n;i++){
           c[i] = sc.nextLong();
       }
       
       Arrays.sort(a);
       Arrays.sort(b);
       Arrays.sort(c);
       
       int count = 0;
       for(int i = 0;i < n;i++){
           long aindex = a[i];
           for(int j = 0;j < n;j++){
               if(aindex < b[j]){
                   long bindex = b[j];
                   for(int k = 0;k < n;k++){
                      if(bindex < c[k]){
                         count++; 
                      }   
                   }                   
               }
           }           
       }
         
       System.out.println(count);
       
       
   }
}
               
        