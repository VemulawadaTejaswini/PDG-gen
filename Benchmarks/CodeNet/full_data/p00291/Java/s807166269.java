import java.util.Scanner;
public class Main{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int a[]=new int [6];
		a[1]=1;a[2]=5;a[3]=10;
		a[4]=50;
			a[5]=100;a[6]=500;
			int ans = 0;
			for(int i=0;i<a.length;i++){
				int temp=sc.nextInt();
				ans+=temp*a[i];
			}
			if(ans>=1000)System.out.println(1);
			else System.out.println(0);
		
	}
}