import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int r = sc.nextInt();
			int c = sc.nextInt();
			if(r==0&&c==0)break;
			if(r==1&&c==2 || r==2&&c==1)System.out.println("yes");
			else if(r==1||c==1)System.out.println("no");
			else if(r%2==0||c%2==0)System.out.println("yes");
			else System.out.println("no");
		}
	}
}