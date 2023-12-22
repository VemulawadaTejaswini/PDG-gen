import static java.lang.Math.*;

import java.util.Scanner;
public class Main{
	static double sum,count=0;
	static double round;
	static Scanner sc=new Scanner(System.in);
	static Main app=new Main();


	void  SUM(double pay,double much ){
		sum+=pay*much;
		round+=much;
		count++;
	}
	void ROUND(double temp){
		temp/=count;
		round=round(temp);
	}

	private static void SystemOut(){
		System.out.println((int)sum);
		System.out.println((int)round);
	}


	public static void main(String[] args) {
		sum=0;
		while(sc.hasNext()){
			String a[]=sc.next().split(",");
			app.SUM(Double.parseDouble(a[0]),Double.parseDouble(a[1]));
		}
		
		app.ROUND(round);
		app.SystemOut();

	}
	

}