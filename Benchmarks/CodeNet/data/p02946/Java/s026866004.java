import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int K=stdIn.nextInt();
		int X=stdIn.nextInt();
		int z=0,x=X-K+1;
		if(x<-1000000)
			x=-1000000;
		while(z<K*2-1&&z<1000001){
			System.out.println(x);
			x++;
			z++;
		}
	}
}