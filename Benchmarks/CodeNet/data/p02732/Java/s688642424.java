import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
   for(int i=0;i<N;i++) {
    A[i] = sc.nextInt();
   }
    Map<Integer,Integer> m = new LinkedHashMap<>();
    for(int j=0;j<N;j++)
    {
      
      m.put(A[j],m.get(A[j])+1);
    }
    int count =0;
    for(int k=0;k<N;k++){
      int temp = A[k];
      for(Integer p:m.keySet()){
        
          int y = m.get(p);
        if(p==temp){
          y=y-1;
        }
       System.out.println((y*y-1)/2);
    }
    
    
    }
    
    
    
    
   
} 
}
