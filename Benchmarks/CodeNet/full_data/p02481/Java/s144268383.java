import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x,y,ans=0,ans2=0;
		x=sc.nextInt();
		y=sc.nextInt();
		ans=x*y;
		ans2=x*2+y*2;
		System.out.printf("%d %d\n",ans,ans2);		sc.close();
	}

}