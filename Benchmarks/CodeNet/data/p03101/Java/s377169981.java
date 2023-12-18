import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H, W, h, w;
		H = sc.nextInt();
		W = sc.nextInt();
		h = sc.nextInt();
		w = sc.nextInt();
 
		while (h > 0) {
			h--;
			H--;
		}
 
		while (w > 0) {
			w--;
			W--;
		}
 
		int ans = H*W;
		if (ans < 0) {
			System.out.println(0);
		} else {
			System.out.println(ans);
		}
	}
 
}