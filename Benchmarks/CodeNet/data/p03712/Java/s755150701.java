import java.util.*;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String X = "";
		String a[] = new String[H];
		for(int i = 0; i < H; i++){
			a[i] = sc.next();
		}
		for(int x =0; x < W; x++){
			 X += "#" ;
		}
		System.out.println("#" + X + "#");
		for(String j : a){
			System.out.println("#" + j + "#");
		}
		System.out.println("#" + X + "#");
	}
}
