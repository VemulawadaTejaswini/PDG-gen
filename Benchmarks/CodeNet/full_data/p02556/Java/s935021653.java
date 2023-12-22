import java.util.*;
import java.io.*;
 
public class Main{
  Scanner sc = new Scanner(System.in);	
 
  public void run(){
    int n = sc.nextInt();
    
    long MAX = 1234567891L;
    long posMax = -MAX;
    long posMin = MAX;
    long negMax = -MAX;
    long negMin = MAX;
    
    for(int i = 0 ;i < n ; i++){
      long x = sc.nextInt();
      long y = sc.nextInt();
      
      long pos = x+y;
      long neg = x-y;
      posMax = Math.max(posMax, pos);
      posMin = Math.min(posMin, pos);
      negMax = Math.max(negMax, neg);
      negMin = Math.min(negMin, neg);
    }
    
    System.out.println(Math.max(posMax-posMin, negMax-negMin));
  }
  public static void main(String[] args){
    Main m = new Main();
    m.run();
  }
}
