import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r=0,w,r1=0;
		double x=0,y=0,si,co;
		String[] str;
		
		while(true){
			
			str=s.next().split(",");
			w=Integer.parseInt(str[0]);
			r=Integer.parseInt(str[1]);
			
			if(w==0 && r==0) break;
			
			si=w*Math.sin((r1*Math.PI/180.0));
			co=w*Math.cos((r1*Math.PI/180.0));

			x=x+si;
			y=y+co;

			if(r<0)r+=360;
			r1+=r;
			r1%=360;
		}
		int ans1=(int)x;
		int ans2=(int)y;
		System.out.println(ans1);
		System.out.println(ans2);

	}

}