import java.util.*;

class Main{
	public static void main(String[] args){
	  Scanner scn = new Scanner(System.in);
      int a = scn.nextInt();
      int b = scn.nextInt();
      int h = scn.nextInt();
      int m = scn.nextInt();
      
      double hpl = h*30+m/2;
      double mpl = m*6;
      
      double pl = Math.abs(hpl-mpl);
      if(pl > 180){
        pl = 360-pl;
      }
      
      double ans = Math.sqrt((a*a) + (b*b) - 2*a*b*Math.cos((Math.toRadians(pl))));
      System.out.println(ans);
	}
}
