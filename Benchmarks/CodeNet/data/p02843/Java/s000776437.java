import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int X=stdIn.nextInt();
		int A=X%100;
		int B=X/100;
		if(X%100==0)
			System.out.println(1);
		else{
			for(int i=0;i<4;i++){
				for(int j=0;j<B;j++){
					if(A>B)
						A--;
					else{
						System.out.println(1);
						System.exit(0);
					}
				}
			}
			System.out.println(0);
		}
	}
}
