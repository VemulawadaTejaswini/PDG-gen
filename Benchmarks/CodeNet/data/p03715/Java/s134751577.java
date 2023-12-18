import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
		int h=sc.nextInt();
		
		long t=w*h;
		//System.out.println(t/3);
		//System.out.println(t%3);
		
		if(w%3==0||h%3==0){
			System.out.println("0");
		}else{
			if(w%2==0&&h%2==0){
				if(h>w){
					int m=h;
					h=w;
					w=h;
				}
				
				long min=Integer.MAX_VALUE;
				//System.out.println(a);
				min=c(w,h);
				System.out.println(min);
			}else if((w%2!=0&&h%2==0)||(w%2==0&&h%2!=0)){
				long min=0;
				if(w%2==0){
					min =c(h,w);
				}else{
					min=c(w,h);
				}
				System.out.println(min);
			}else{
				if(h>w){
					int m=h;
					h=w;
					w=h;
				}
				long min=c(w,h);
				System.out.println(min);
			}
		}
		
	}
	public static long c(long w,long h){
		long a=h/2;
		long b=h-a;
		long min=Integer.MAX_VALUE;
		//System.out.println(w+" "+h+" "+a+" "+b);
		for(int i=1;i<=w;i++){	
			long p=i;long q=w-i;
			//System.out.println(p+q);
			long sum1=(q*a);
			long sum2=(q*b);
			if(sum1<=sum2){
				long s=(p*h)-sum1;
				long s1=(p*h)-sum2;
				if(s<0){
					s=-s;
				}
				if(s1<0){
					s1=-s1;
				}
				if((p*h)>s1&&s<min){
					//System.out.println(p+" "+q+" "+(p*h)+" "+s1);
					min=(long)s;
				}
			}
			
		}
		return min;
	}
	

}