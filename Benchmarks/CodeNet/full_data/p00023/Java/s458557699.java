import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans;
		double xa,ya,ra,xb,yb,rb;
		for(int i=0;i<n;i++){
			while(true){
				xa=sc.nextDouble();
				ya=sc.nextDouble();
				ra=sc.nextDouble();
				xb=sc.nextDouble();
				yb=sc.nextDouble();
				rb=sc.nextDouble();
				double X=Math.abs(xa-xb);
				double Y=Math.abs(ya-yb);
				double h=Math.sqrt(X*X+Y*Y);
				if(h>ra+rb){
					ans=0;
					break;
				}
				if(ra>rb){
					if(ra>h){
						ans=2;
						break;
					}
				}else{
					if(rb>h){
						ans=-2;
						break;
					}
				}
				ans=1;
				break;
			}
			System.out.println(ans);
		}
		sc.close();
	}
}