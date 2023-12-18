import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int C=stdIn.nextInt();
		int X=stdIn.nextInt();
		int Y=stdIn.nextInt();
		int ans=0;
		if((A+B)*Math.min(X,Y)>=C*2*Math.min(X,Y)){
			ans+=C*2*Math.min(X,Y);
			if(X<Y){
				Y-=X;X=0;
			}
			else{
				X-=Y;Y=0;
			}
		}
		if(A*X>=C*2*X){
			ans+=C*2*X;
			Y-=X;X=0;
		}
		if(Y<0)
			Y=0;
		if(B*Y>=C*2*Y){
			ans+=C*2*Y;
			X-=Y;Y=0;
		}
		if(X<0)
			X=0;
		ans+=A*X;
		ans+=B*Y;
		System.out.println(ans);
	}
}
