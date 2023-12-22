import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0; i<n; i++){
			double xa = in.nextDouble();
			double ya = in.nextDouble();
			double ra = in.nextDouble();
			double xb = in.nextDouble();
			double yb = in.nextDouble();
			double rb = in.nextDouble();
			int ans = 0;
			if(Math.sqrt((xa-xb)*(xa-xb)+(ya-yb)*(ya-yb))+rb<ra) ans=2;
			else if(Math.sqrt((xa-xb)*(xa-xb)+(ya-yb)*(ya-yb))+ra<rb) ans=-2;
			else if(Math.sqrt((xa-xb)*(xa-xb)+(ya-yb)*(ya-yb))>ra+rb) ans=0;
			else ans=1;
			System.out.println(ans);
		}
	}
}