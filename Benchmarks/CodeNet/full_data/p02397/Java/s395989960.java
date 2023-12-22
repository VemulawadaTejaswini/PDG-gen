import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int t;
		for(;;){
			int x=stdIn.nextInt();
			int y=stdIn.nextInt();
			if(x<1&&y<1)break;
			if(x>y){
				t=x;
				x=y;
				y=t;
			}
			System.out.println(x+" "+y);
		}
	}
}
