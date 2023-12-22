import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int W = in.nextInt();
		int H = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		int r = in.nextInt();
		if((W>(r+x)) && (H > (r+y))){
			System.out.println("Yes");
		} else{
			System.out.println("No");
		}
;	}
}