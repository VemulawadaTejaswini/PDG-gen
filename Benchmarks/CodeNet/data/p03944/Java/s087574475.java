import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int W=in.nextInt();
		int H=in.nextInt();
		int N=in.nextInt();
		int newH=0;
		int newW=0;
		int temp1=0;
		int temp2=W;
		int temp3=0;
		int temp4=H;
		int area=0;
		for (int i = 0; i < N; i++) {
			int x=in.nextInt();
			int y=in.nextInt();
			int a=in.nextInt();
			if(a==1)
				temp1=Math.max(temp1,x);
			if(a==2)
				temp2=Math.min(temp2,x);
			
			newW=(W-temp1)-(W-temp2);
			
			if(a==3)
				temp3=Math.max(temp3,y);
			if(a==4)
				temp4=Math.min(temp4,y);
			
			newH=(H-temp3)-(H-temp4);

		}
		area=newH*newW;
		if(area<0)
			area=0;
		if(newW<0 && newH<0)
			area=0;
		System.out.println(area);
	}
}