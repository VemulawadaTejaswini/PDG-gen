import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		long mod=1000000007L;
		int n=sc.nextInt();
		boolean g=false;
		if(n%2==0){n++;g=true;}
		int a[]=new int[n];
		for (int i = 0; i < n; i++) {
			if(g&&i==n-1){a[n-1]=0;break;}
			a[i]=sc.nextInt();
		}
		if(g){
			for (int i = 0; i < n-1; i++) {
				a[i]++;
			}
		}
		
			int b[]=new int[n/2+1];
			for (int i = 0; i < n; i++) {
				if(a[i]%2==1){System.out.println(0);return;}
				b[a[i]/2]++;
			}
			boolean ok=true;
			for (int i = 0; i < b.length; i++) {
				if(i==0&&b[i]!=1)ok=false;
				else if(i!=0&&b[i]!=2)ok=false;
			}
			if(ok)System.out.println((int)(Math.pow(2,n/2)%mod));
			else System.out.println(0);
			
			
			
		
		}
		
	}
