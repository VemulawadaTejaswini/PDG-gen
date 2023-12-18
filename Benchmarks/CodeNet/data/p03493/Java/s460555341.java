import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int s=stdIn.nextInt(),a=0;
		do {
			if(s%10==1) a++;
			s/=10;
		}while(s!=0);
		System.out.print(a);
	}
}