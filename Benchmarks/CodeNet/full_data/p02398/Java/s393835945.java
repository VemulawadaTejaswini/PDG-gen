import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt();
		int b=stdIn.nextInt();
		int c=stdIn.nextInt();
		int i,s=0;
		for(i=a;i<=b;i++)if(c%i==0)s++;
		System.out.println(s);
	}
}
