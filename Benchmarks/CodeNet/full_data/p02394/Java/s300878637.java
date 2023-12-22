import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int w=stdIn.nextInt();
		int h=stdIn.nextInt();
		int x=stdIn.nextInt();
		int y=stdIn.nextInt();
		int r=stdIn.nextInt();
		if(0<=x-r&&x+r<=w&&0<=y-r&&y+r<=h){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}