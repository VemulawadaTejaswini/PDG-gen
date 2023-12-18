import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long t1=sc.nextLong();
		long t2=sc.nextLong();
		long a1=sc.nextLong();
		long a2=sc.nextLong();
		long b1=sc.nextLong();
		long b2=sc.nextLong();
		if((a1>b1 && a1*t1+a2*t2>b1*t1+b2*t2) || (b1>a1 && a1*t1+a2*t2<b1*t1+b2*t2)){
			System.out.println(0);
		}else if(a1*t1+a2*t2==b1*t1+b2*t2){
			System.out.println("infinity");
		}else{
			System.out.println(1+2*(Math.abs(a1*t1-b1*t1)/Math.abs(a1*t1+a2*t2-(b1*t1+b2*t2))));
		}
	}
}
