import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		long N=stdIn.nextLong();
		long A[]=new long[5];
		int z=0;
		while(z<5){
			A[z]=stdIn.nextInt();
			z++;
		}z=0;
		long y=N/A[0]+1,min=0,miny=N/A[0]+1;
		min=A[0];
		while(z<5){
			if(A[z]<min){
				y+=N/A[z]+1-miny;
				min=A[z];miny=N/A[z]+1;
			}
			if(z!=0)
				y++;
			z++;
		}
		System.out.println(y);
	}
}