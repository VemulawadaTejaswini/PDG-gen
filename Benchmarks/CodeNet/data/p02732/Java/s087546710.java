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
      if(m.get(A[j])==null){
        m.put(A[j],1);
      }else{
      m.put(A[j],m.get(A[j])+1);
      }
    }
    int count =0;
    for(int k=0;k<N;k++){
      count =0;
      for(int l=0;l<N;l++){
        if(l!=k){
          int y = m.get(A[l]);
       
       count+=(y*y-1)/2;
    }
      }
      System.out.println(count);
    
    
    }
    
    
    
    
   
} 
}
