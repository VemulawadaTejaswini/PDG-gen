import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		long H=stdIn.nextLong();
		long ans=0,i=1;
		while(true){
			ans+=i;
			if(H==1)
				break;
			H/=2;i*=2;
		}
		System.out.println(ans);
	}
}
