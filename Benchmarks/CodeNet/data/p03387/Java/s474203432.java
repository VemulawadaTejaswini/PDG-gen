import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int max=Math.max(Math.max(A,B), C);
		int difA=max-A;
		int difB=max-B;
		int difC=max-C;
		int[] matome= {difA,difB,difC};
		Arrays.sort(matome);
		int kaisu=matome[1];

		if((matome[2]-matome[1])%2==0) {
			kaisu+=(matome[2]-matome[1])/2;
		}

		else if((matome[2]-matome[1])%2==1) {
			kaisu+=(matome[2]-matome[1])/2;
			kaisu+=2;
		}
		System.out.println(kaisu);
	}
}