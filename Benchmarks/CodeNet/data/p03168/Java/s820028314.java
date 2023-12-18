import java.io.*;
import java.util.*;
public class Main{
  	public static int max = 1000000007;
	public static void main(String args[]) throws IOException{
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
     double p[] = new double[n];
      
      for(int i=0;i< n; i++)
        p[i] = sc.nextDouble();
      
      System.out.println(calProb(p, 0, 0, 1));
      
      /*
      String dp[][] =  new String[n.length()][m.length()];
      System.out.println(sub(n, m , 0, 0, dp));
      */
    }
  
  public static double calProb(double p[], int pos, int h, double prob){
    if(pos == p.length && h > p.length/2)
      return prob;
    
    if(pos == p.length)
      return 0;
    
    return calProb(p, pos+1, h+1, prob * p[pos]) + calProb(p, pos+1, h, prob * (1-p[pos]));
  }
   
}
