import java.util.*;

public class  Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double x,y,ans=0.0,ans2=0.0;
		x=sc.nextDouble();
		y=sc.nextDouble();
		ans=x*y;
		ans2=x*2+y*2;
		System.out.print(ans);
		System.out.println("  "+ans2);
		sc.close();
	}

}