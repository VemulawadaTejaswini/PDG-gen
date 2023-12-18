import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static int w=sc.nextInt();
	private static int first=sc.nextInt();
	private static int second=sc.nextInt();
	private static int dist;
	public static void main(String[] args){
		if(first>second){
			int t=first;
			first=second;
			second=t;
		}
		if(first+w<second) dist=second-first-w;
		else dist=0;
		System.out.println(dist);
	}
}