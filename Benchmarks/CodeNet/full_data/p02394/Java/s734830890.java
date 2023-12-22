import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int W=in.nextInt();
		int H=in.nextInt();
		int x=in.nextInt();
		int y =in.nextInt();
		int r=in.nextInt();
		int A=W-x-r;
		int B=H-y-r;
		if((A>=0)&&(B>=0)&&(x>=r)&&(y>=r)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

}
}

