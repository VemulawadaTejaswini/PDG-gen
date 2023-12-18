import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    //monsters
    int n = sc.nextInt();
    //critical attacks
    int k = sc.nextInt();
    //min times of normal attacks
    long kn = 0;
    
    if(!(n<=k)){
      
    //kill by critical attacks
    long[] kc = new long[k];
    
    for(int i=0; i<k; i++){
      kc[i] = sc.nextLong();
    }
    
    
    for(int i=0; i<n-k; i++){
      long next = sc.nextLong();
      
      if(k!=0){
        long min = kc[0];
        if(min<next){
          kc[0]=next;
          kn += min;
        }
      }else{
        kn += next;
      }
    }
    }
        
    System.out.println(kn);
  }
}