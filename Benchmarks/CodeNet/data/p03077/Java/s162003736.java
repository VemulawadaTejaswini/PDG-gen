import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Long N = sc.nextLong();
    Long [] X = new Long[6];
    X[0] = N;
    X[1] = 0L;
    X[2] = 0L;
    X[3] = 0L;
    X[4] = 0L;
    X[5] = 0L;
    Long min = Long.MAX_VALUE;
    int c = 0;
    Long [] between = new Long[5];
    for(int i =0;i<5;i++){
      between[i] = sc.nextLong();
      if(between[i]<= min){
          c = i;
          min = between[i];
      }
    }
    Long tmp = 0L; 
    if(N%min!=0){
      tmp = N/min+1;
    }else{
      tmp = N/min;      
    }
    System.out.println(tmp+4);    
    // System.out.println(min);    
  
  }
}


