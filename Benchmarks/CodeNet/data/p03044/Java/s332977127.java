import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b[]=new int[a+1];
		int m=sc.nextInt();
			int n=sc.nextInt();
			int l=sc.nextInt();
		if(l%2==0){
				b[m]=0;
				b[n]=0;
			}
			else{
				b[m]=0;
				b[n]=1;
			}
		for(int i=2;i<a;i++){
			m=sc.nextInt();
			n=sc.nextInt();
			l=sc.nextInt();
			if(l%2==0){
				if(b[m]==0)
					b[n]=0;
				else b[n]=1;
			}
			else{
				if(b[m]==0)
					b[n]=1;
				else b[n]=0;
			}
		}
		for(int i=1;i<=a;i++)
			System.out.println(b[i]);
	}
}