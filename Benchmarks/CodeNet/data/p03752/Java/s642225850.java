import java.util.Scanner;

public class Main{
	
	static Scanner s=new Scanner(System.in);
	
	public static void main(String[] __){
		int n=s.nextInt(),k=s.nextInt(),a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		
		int beginH=0,res=0;
		for(int i=0;i<n;i++)
			beginH=Math.max(beginH,a[i]-i);
		for(int i=0;i<n;i++)
			res+=beginH+i-a[i];
		
		System.out.println(res);
	}
}
