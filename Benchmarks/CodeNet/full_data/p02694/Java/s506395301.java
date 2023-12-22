import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		long X=stdIn.nextLong();
		long ans=1,key=100;
		while(true){
			if(key>=X){
				System.out.println(ans-1);
				System.exit(0);
			}
			key*=1.01;
			ans++;
		}
	}
}
