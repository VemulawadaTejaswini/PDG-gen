import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!

        Scanner sc = new Scanner (System.in);
        
    String x=sc.nextLine();
    String y=sc.nextLine();
    
    int c=0;
    int z=0;
    
  for(int i=0;i<x.length();i++){
      char xx=x.charAt(i);
      char yy=y.charAt(i);
      
      if(xx!=yy){
        c++;
      }
      
      
  }
  System.out.println(c);
    
        
    
    }
}
