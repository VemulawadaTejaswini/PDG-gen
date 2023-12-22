
import java.util.Scanner;




public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w=sc.nextInt();
		int h=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int r=sc.nextInt();
		boolean a=((x-r)>0 && (x+r)<=w);
		boolean b=((y-r)>0 && (y+r)<=h);
		if(a && b){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
