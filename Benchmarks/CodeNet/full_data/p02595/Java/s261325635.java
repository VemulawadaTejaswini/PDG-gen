import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long d=sc.nextLong();
		int ans=0;
		
		
		for(int i=0;i<n;i++) {
			long x=Math.abs(sc.nextLong());
			long y=Math.abs(sc.nextLong());
			if(Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2))<=d)ans++;
			//System.out.println(Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)));
		}
		
	 System.out.println((int)ans);
		
	}

}
