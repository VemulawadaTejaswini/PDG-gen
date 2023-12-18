
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		int n[] = new int[32];
		 n[0]=1;
		 n[1]=1;
		 n[2]=1;
		 n[3]=2;
		 n[4]=1;
		 n[5]=2;
		 n[6]=1;
		 n[7]=5;
		 n[8]=2;
		 n[9]=2;
		 n[10]=1;
		 n[11]=5;
		 n[12]=1;
		 n[13]=2;
		 n[14]=1;
		 n[15]=14;
		 n[16]=1;
		 n[17]=5;
		 n[18]=1;
		 n[19]=5;
		 n[20]=2;
		 n[21]=2;
		 n[22]=1;
		 n[23]=15;
		 n[24]=2;
		 n[25]=2;
		 n[26]=5;
		 n[27]=4;
		 n[28]=1;
		 n[29]=4;
		 n[30]=1;
		 n[31]=51;

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		System.out.print(n[A-1]);
		
	}
}


