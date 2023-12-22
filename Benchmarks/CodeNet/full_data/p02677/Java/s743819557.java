import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	double a=sc.nextDouble(),b=sc.nextDouble(),ax,ay,bx,by,c;
  	int h=sc.nextInt(),m=sc.nextInt(),hm=h*60+m;
  	ax=a*Math.cos(Math.toRadians((double)hm/(double)2));
  	ay=a*Math.sin(Math.toRadians((double)hm/(double)2));
  	bx=b*Math.cos(Math.toRadians((double)m*(double)6));
  	by=b*Math.sin(Math.toRadians((double)m*(double)6));
  	c=(ax-bx)*(ax-bx)+(ay-by)*(ay-by);
  	System.out.println(Math.pow(c,0.5));
  }
}