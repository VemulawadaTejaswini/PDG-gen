package jugyou;
import java.util.*;
public class Main {
	static int top;
	static int kizi;
	static int cost;
	static int kcal;
	static int kane;
	static int ping[] = new int [101];
	static void doIt(){
		 Scanner in = new Scanner(System.in);
	     top = in.nextInt();
	     kizi = in.nextInt();
	     cost = in.nextInt();
	     kcal = in.nextInt();
	     kane=kizi;
	     for(int i=0;i<top;i++)ping[i]=in.nextInt();
	     java.util.Arrays.sort(ping);
	     int ans=kensa();
	     System.out.println(ans);
	}
	static int kensa(){
		 for(int s=101-top;s<101;s++){
	         double a = kcal/kane;
	         double b = (kcal+ping[s])/(kane+cost);
	         System.out.println(a+" "+b);
	         if(a<=b){
	             kcal+=ping[s];
	             kane+=cost;
	         }else break;
		 }
		 return (int)(kcal/kane);
	}
	public static void main(String[] args) {
		Main.doIt();
	}
}