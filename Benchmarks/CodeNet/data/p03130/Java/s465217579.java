import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int A[]=new int[4];
		for(int i=0;i<3;i++){
			int a=stdIn.nextInt()-1;
			int b=stdIn.nextInt()-1;
			A[a]++;A[b]++;
			if(A[a]>2||A[b]>2){
				System.out.println("NO");
				System.exit(0);
			}
		}
		if(A[0]!=0&&A[1]!=0&&A[2]!=0&&A[3]!=0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
