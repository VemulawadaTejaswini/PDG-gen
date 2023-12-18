import java.util.*;
public class Main{
    public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),z=s.nextInt(),w=s.nextInt(),a[]=new int[n--];
		Arrays.setAll(a,i->s.nextInt());
		System.out.println(n==0?Math.abs(a[0]-w):Math.max(Math.abs(a[n]-w),Math.abs(a[n-1]-a[n])));
	}
}