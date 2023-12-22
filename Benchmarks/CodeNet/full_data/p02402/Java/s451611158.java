import java.util.Scanner;
public class Main{
	static Scanner sc = new Scanner(System.in);
	static int number = sc.nextInt();
	public static void main (String[] args) {
		Main MMS = new Main(); 
		System.out.println(MMS.min(number-1)+" "+MMS.max(number-1)+" "+MMS.sum(number-1));
	}	
	int a[]=new int[number];
	public int min(int n){ 
		a[n] = sc.nextInt();
		if (n!=0) {return Math.min(a[n], min(n-1));} //compare a[n] and min value until (n-1)th number
		else return a[0];	
	}
	public int max(int n){
		if (n!=0) {return Math.max(a[n], max(n-1));} //compare a[n] and max value until (n-1)th number
		else return a[0];	
	}
	public long sum(int n){ 
		if (n!=0) {return a[n]+sum(n-1);}
		else return a[0];
	}
}