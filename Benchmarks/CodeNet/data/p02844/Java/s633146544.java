import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		String S=stdIn.next();
		boolean key=false;
		int ans=0;
		for(int i=0;i<1000;i++){
			String a[]=new String[3];
			int b=0;
			a[2]=String.valueOf(i%10);
			if(i<100)
				a[0]="0";
			else
				a[0]=String.valueOf(i/100);
			if(i<10)
				a[1]="0";
			else
				a[1]=String.valueOf(i/10%10);
			for(int j=0;j<N;j++){
				if(a[b].equals(S.substring(j,j+1)))
					b++;
				if(b==3)
					key=true;
			}
			if(key)
				ans++;
		}
		System.out.println(ans);
	}
}
