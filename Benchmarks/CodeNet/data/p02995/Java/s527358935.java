import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int  a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();
     int d = sc.nextInt();
     int cd,x,y,z,ans;
     cd = lcm(c,d);
     x= b/c -(a-1)/c;
     y= b/d -(a-1)/c;
     z= b/cd -(a-1)/cd;
     ans= b-a+1-x-y+z; 
     System.out.println(ans);
   }

   static int lcm (int a, int b) {
	int temp;
	long c = a;
	c *= b;
	while((temp = a%b)!=0) {
		a = b;
		b = temp;
	}
	return (int)(c/b);
}
}
