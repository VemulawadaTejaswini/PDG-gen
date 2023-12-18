import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     long  a = sc.nextLong();
     long b = sc.nextLong();
     int c = sc.nextInt();
     int d = sc.nextInt();
     int cd;
      long x,y,z,ans;
     cd = lcm(c,d);
     x= (int)b/c -(int)(a-1)/c;
     y= (int)b/d -(int)(a-1)/c;
     z= (int)b/cd -(int)(a-1)/cd;
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
