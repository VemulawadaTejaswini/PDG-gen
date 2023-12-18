import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		long K=stdIn.nextLong();
		long A=stdIn.nextLong();
		long B=stdIn.nextLong();
		int z=0;
		if(B-A>2){
			K-=A-1;
			if(K%2==1)
				System.out.println((K/2)*(B-A)+1+A);
			else
				System.out.println((K/2)*(B-A)+A);
		}
		else
			System.out.println(1+K);
	}
}