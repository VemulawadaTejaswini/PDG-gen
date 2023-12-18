import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.next());
		int ans = 0;
		for (int i=1; i<X; i++){
			for(int p=2; p<X; p++){
				if (Math.pow(i, p) < X){
					ans = Math.max((int)Math.pow(i, p), ans);
				}else{
					break;
				}
			}
		}
	}
}