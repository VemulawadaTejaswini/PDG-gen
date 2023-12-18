import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		for(int i=1;i<N;i++){
			if((int)(i*1.08)==N){
				System.out.println(i);
				System.exit(0);
			}
		}
		System.out.println(":(");
	}
}
