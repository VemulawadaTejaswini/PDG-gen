import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int w=stdIn.nextInt();
		int h=stdIn.nextInt();
		int x=stdIn.nextInt();
		int y=stdIn.nextInt();
		int r=stdIn.nextInt();
		System.out.println(x+r<=w&&x-r>=0&&y+r<=h&&y-r>=0?"Yes":"No");
	}
}
