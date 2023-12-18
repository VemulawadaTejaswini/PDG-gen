import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt(),k=stdIn.nextInt(),a,i;
		for(i=0;i<n;i++) a=stdIn.nextInt();
		System.out.print((n-2)/(k-1)+1);
	}
}