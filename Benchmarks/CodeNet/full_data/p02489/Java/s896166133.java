import java.io.*;
public class Main {
	public static void main(String args[])throws Exception{
		boolean bl=true;
		int Case=1;
		while(bl==true){
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int n=Integer.parseInt(br.readLine());
			if(n==0)bl=false;
			if(n!=0)System.out.println("Case "+n+": "+Case);
			Case++;
		}
	}
}
//by TTTMongolia 10/05/2012