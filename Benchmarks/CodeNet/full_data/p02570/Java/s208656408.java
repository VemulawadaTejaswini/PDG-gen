
import java.util.*;
public class Main{
	public static void main(String[] args) {
      int d,t,s;
      Scanner sc=new Scanner(System.in);
      d=sc.nextInt();
      t=sc.nextInt();
      s=sc.nextInt();
      int dis=s*t;
      if(dis>=d)
      {
    	  System.out.println("Yes");
      }
      else {
    	  System.out.println("No");
      }
      sc.close();
	}

}
