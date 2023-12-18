import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      double a = sc.nextInt();
      double b = sc.nextInt();
      double c = sc.nextInt();
      double d = sc.nextInt();
      double ans ;
       if(a<b){ans=a;}else{ans=b;}
       if(c<d){ans=ans+c;}else{ans=ans+d;}
      System.out.println(ans);
   }
 }
