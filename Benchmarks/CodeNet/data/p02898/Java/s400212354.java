
import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt(),ans=0;
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			if(x>=k) ans++;
		}
		System.out.print(ans);
	}

}





