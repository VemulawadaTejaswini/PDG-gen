import java.util.*;
class Main {
  public static void main (String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    long x = sc.nextInt();
    
     //long[] gap = new long[n];
     
     long x1=x;
     long x2=0;
     
     long min1 =1000000000;
     long min2 =999999999;
     
     
    
    for(int i=0; i<n; i++){
      x2 = sc.nextLong();
      long gap = Math.abs(x2-x1);
      if(gap<min2){
        min2=gap;
        }else if(gap<min1){
          min2 = min1;
          min1 = gap;
          }
       x1 = x2;
      }
      
    long ans = eu(min1, min2);
    
    System.out.println(ans);

    
    }
    
    public static long eu(long  min1, long min2){
      if(min1==1)return min2;
      if(min2%min1==0){
        return min1;
        }
        return eu(min2%min1,min1);
      }
}