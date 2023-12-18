import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int w=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt(),min,max;
    min=Math.min(a,b);
    max=Math.max(a,b);
    if(max-min-w>0){
      System.out.println(max-min-w);
    }else{
      System.out.println(0);
    }
  }
}
