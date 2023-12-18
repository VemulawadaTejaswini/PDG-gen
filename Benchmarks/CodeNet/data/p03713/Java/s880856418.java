import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long h=sc.nextLong();
		long w=sc.nextLong();
		long ans=Long.MAX_VALUE;
		for(long i=1; i<h; i++){
			long max=i*w;
			long min=i*w;
			long lo=Math.max(w,h-i);
			long sh=Math.min(w,h-i);
			if((h-i)%2==0 || w%2==0){
				max=Math.max(max,(h-i)*w/2);
				min=Math.min(min,(h-i)*w/2);
			}else{
				max=Math.max(max,(h-i)*w-lo/2*sh);
				min=Math.min(min,lo/2*sh);
			}
			ans=Math.min(ans,max-min);
		}
		for(long i=1; i<w; i++){
			long max=i*h;
			long min=i*h;
			long lo=Math.max(h,w-i);
			long sh=Math.min(h,w-i);
			if((w-i)%2==0 || h%2==0){
				max=Math.max(max,(w-i)*h/2);
				min=Math.min(min,(w-i)*h/2);
			}else{
				max=Math.max(max,(w-i)*h-lo/2*sh);
				min=Math.min(min,lo/2*sh);
			}
			ans=Math.min(ans,max-min);
		}
		System.out.println(ans);
	}
}
