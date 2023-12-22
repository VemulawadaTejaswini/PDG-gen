import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double x,h,c,s,ans;
		while(true){
			x=sc.nextDouble();
			h=sc.nextDouble();
			if(x==0 && h==0) break;
			c=Math.sqrt(h*h+(x/2)*(x/2));
			s=c*x*2;
			ans=s+x*x;
			System.out.printf("%.6f\n",ans);
		}
	}
}