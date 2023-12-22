import java.util.*;
public class Main{
	private static Scanner sc=new Scanner(System.in);
	public static void  main(String[]agrs){
		while(sc.hasNextDouble()){
			double j=sc.nextDouble();
			double t=j/9.8;
			double y=4.9*Math.pow(t,2);
			double N=(y+5)/5;
			int ans=(int) N;
			if(ans<N)System.out.println(ans+1);
			else System.out.println(ans);
		}   
	}
}