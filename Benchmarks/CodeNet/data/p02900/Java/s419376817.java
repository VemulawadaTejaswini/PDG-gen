import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		long A=stdIn.nextLong();
		long B=stdIn.nextLong();
		long a=0,b=0;
		int ans=0;
		while(true){
			if(A%B!=0){
				a=A%B;
				A=B;B=a;
			}
			else
				break;
		}a=B;b=a/2+1;
		boolean c[]=new boolean[(int)a/2+3];
		while(true){
			while(true){
				if(a%b!=0)
					b--;
				else
					break;
			}
			if(c[(int)(a/b)]==false){
				ans++;
				c[(int)(a/b)]=true;
			}
			if(b==1)
				break;
			a=b;b=a/2+1;
		}
		ans++;
		System.out.println(ans);
	}
}
