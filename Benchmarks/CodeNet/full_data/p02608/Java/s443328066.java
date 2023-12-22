import java.util.*;

public class Main{
	
  public static boolean isInteger( String input ) {
    try {
        Integer.parseInt( input );
        return true;
    }
    catch( Exception e ) {
        return false;
    }
}
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),f,e;
    for(int i=1;i<=n;i++){
      f=0;
      
      for(int x=1;x<=(int)Math.pow(n,0.5);x++){
        for(int y=1;y<=(int)Math.pow(n,0.5);y++){
          
            double d=Math.pow(4*i-3*(x*x+y*y)-2*x*y,0.5)/(double)2-(double)((x+y)/2);
            e=(int)(d*10000)%10000;
          if(e<1&&e>=0&&d>0){
            f++;
          }
        }
      }
      System.out.println(f);
    }
  }
}
