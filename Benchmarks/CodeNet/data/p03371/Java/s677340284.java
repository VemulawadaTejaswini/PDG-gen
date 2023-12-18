import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		long ans=0;
		if(a+b<2*c){
			ans+=(a+b)*Math.min(x,y);
		}else{
			ans+=2*c*Math.min(x,y);
		}
		if(x>y){
			ans+=(x-y)*Math.min(2*c,a);
		}else{
			ans+=(y-x)*Math.min(2*c,b);
		}
		System.out.println(ans);
	}
}

