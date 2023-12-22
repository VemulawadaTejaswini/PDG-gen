import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sr = new Scanner(System.in);
    int A = sr.nextInt();
    int V = sr.nextInt();
    int B = sr.nextInt();
    int W = sr.nextInt();
    int T = sr.nextInt();
    int dis = Math.abs(B-A);
    if(W>=V)
      System.out.println("NO");
    else
      for(int i =0;i<=T;i++){
        if(V*i==W*i+dis){
          System.out.println("Yes");
        	break;
        }else if(i==T)
            System.out.println("NO");
      }
    	
  }

}