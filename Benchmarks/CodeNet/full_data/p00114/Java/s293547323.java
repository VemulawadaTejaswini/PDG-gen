import java.util.*;
public class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int x,y,z,s,a,b,c,d,o,p,q;
       while(true)
	   {
	       a = sc.nextInt();
	       if(a==0)
		   break;
	       o = sc.nextInt();
	       b = sc.nextInt();
	       p = sc.nextInt();
	       c = sc.nextInt();
	       q = sc.nextInt();
	       sc.nextLine();
	       s=0;
	       x=y=z=1;
	       do{
		   x=a*x%o;
		   y=b*y%p;
		   z=c*z%q;
		   s++;
	       }while(x!=1||y!=1||z!=1);
	       System.out.println(s);
	   }
   }
}