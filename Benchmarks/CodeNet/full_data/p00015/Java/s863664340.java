import java.math.BigInteger;
import java.util.Scanner;


class Main{

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int temp=Integer.valueOf(scan.nextLine());
		for(int i=0;i<temp;i++){
		BigInteger a1=new BigInteger(scan.nextLine());
		BigInteger a2=new BigInteger(scan.nextLine());
		a1=a1.add(a2);
		System.out.println(a1);
		}
	}
}