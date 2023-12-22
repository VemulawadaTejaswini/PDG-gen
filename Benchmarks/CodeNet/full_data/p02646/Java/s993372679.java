import java.util.*;
import java.math.*;
public class Main{
  public static void main(String[] args){
    Scanner sr = new Scanner(System.in);
    int A = sr.nextInt();
    int V = sr.nextInt();
    int B = sr.nextInt();
    int W = sr.nextInt();
    int T = sr.nextInt();
    
    int D = Math.abs(B-A);
    int S = V-W;
    if(S*T<D){System.out.println("NO");}
    	else{System.out.println("YES");}
  }

}