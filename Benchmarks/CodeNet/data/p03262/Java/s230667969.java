import java.util.*;
class Main {
  public static void main (String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    long x = sc.nextLong();
  
     
     
     long xi=0;
     //long x0=Math.abs(sc.nextLong()-x);
     
     long xf=1;
    
    for(int i=0; i<n; i++){
      xi = Math.abs(sc.nextLong()-x);
      
      xf =eu(Math.min(xi,xf),Math.max(xi, xf));
      
      }
      
    //long ans = eu(min1, min2);
    
    System.out.println(xf);

    
    }
    
    public static long eu(long  min1, long min2){
      //if(min1==1)return min2;
      //if(min2%min1==min1)return 1;
      if(min2%min1==0){
        return min1;
        }
        return eu(min2%min1,min1);
      }
}