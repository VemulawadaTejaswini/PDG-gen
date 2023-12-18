import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] t = new int[N];
   for(int i=0;i<N;i++)  t[i] = sc.nextInt();
   
   long ans =0;
   for(int i=0;i<N-1;i++) ans = lcm((long)t[i],(long)t[i+1]);
   
   System.out.println(ans);
 }
  
  static long lcm (long a, long b) {
	long temp;
	long c = a;
	c *= b;
	while((temp = a%b)!=0) {
		a = b;
		b = temp;
	}
	return (long)(c/b);
}
}