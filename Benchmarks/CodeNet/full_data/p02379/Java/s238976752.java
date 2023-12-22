import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		Double x1=sc.nextDouble(),y1=sc.nextDouble(),x2=sc.nextDouble(),y2=sc.nextDouble();
		Double ans=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println(ans);
	}

}