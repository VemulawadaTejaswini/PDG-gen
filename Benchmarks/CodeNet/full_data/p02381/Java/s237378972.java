import java.util.Scanner;
public class Main {
	private static Scanner sc=new Scanner(System.in);
	public static void main (String[] args){
	while(true){
		int n=sc.nextInt();
		if(n==0) break;
		int[] s=new int[n];
		double sum=0;
		for(int i=0;i<n;i++){
			s[i]=sc.nextInt();
			sum=sum+s[i];
		}
		double ave=sum/n;
		double ssum=0;
		for(int i=0;i<n;i++){
			ssum=ssum+(s[i]-ave)*(s[i]-ave);
		}
		System.out.println(Math.sqrt(ssum/n));
	}
	}
}