import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan =new Scanner(System.in);
		int x=scan.nextInt();
		if(x<1){x=1;}
		if(x>100){x=100;}
		System.out.println(x*x*x);
	}
}