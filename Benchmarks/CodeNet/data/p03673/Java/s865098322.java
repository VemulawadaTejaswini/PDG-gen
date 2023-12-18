import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
   
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }
    
    System.out.print(a[n-1] + " ");
    for(int i = 0; i < n-1 ; i++){
       if(i%2 !=0){
         System.out.print(a[i] + " ");
       }
     }
    
     for(int i = 0; i < n-1 ; i++){
       if(i%2 ==0){
         System.out.print(a[i] + " ");
       }
     }
      
        System.out.println();
  }  
}