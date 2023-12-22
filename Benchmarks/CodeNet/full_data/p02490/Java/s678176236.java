import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		while(true){
			int x=stdIn.nextInt();
			int y=stdIn.nextInt();
			if(x==0&&y==0) break;
			if(x>y) System.out.println(y+" "+x);
			else System.out.println(x+" "+y);
	}
}