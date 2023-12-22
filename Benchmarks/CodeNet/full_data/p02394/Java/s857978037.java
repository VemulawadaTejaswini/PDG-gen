import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int W=sc.nextInt();
		int H=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int r=sc.nextInt();
		if(r>0 && x>=r && y>=r && W>=x+r && H<=y+r) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}

