import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
   	int n = sc.nextInt();
    int as[] = new int[n+2];
    int acs[] = new int[n];
    int ap = 0;
    int in,out;
    
    as[0] = 0;
    as[1] = sc.nextInt();
    ap += as[1];
    in = as[1];
    
    for(int i = 2;i <= n;i++) {
      as[i] = sc.nextInt();
      out = as[i] - as[i-1];
      ap += Math.abs(out);
      if(in * out < 0)acs[i-2] = Math.abs(in) + Math.abs(out) -Math.abs(as[i]-as[i-2]);
      else acs[i-1] = 0;
      in = out;
    }  
    as[n+1] = 0;
    out = as[n+1] - as[n];
    ap += Math.abs(out);
    if(in * out < 0)acs[n-1] = Math.abs(in) + Math.abs(out) -Math.abs(as[n+1]-as[n-1]);
    else acs[n-1] = 0;
    
    for(int i = 0;i < n;i++){
      System.out.println(ap - acs[i]);
    }
    
    

  }
}
