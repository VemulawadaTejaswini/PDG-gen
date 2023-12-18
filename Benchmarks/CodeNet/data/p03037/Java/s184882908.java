import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner seer = new Scanner(System.in);
		int n = seer.nextInt();
		int m = seer.nextInt();
		int[] d = new int[n];
		int maxa = 0, minb = n+1;
		for(int i = 0; i < m; i++){
			int a = seer.nextInt();
			int b = seer.nextInt();
			maxa = Integer.max(maxa, a);
			minb = Integer.min(minb, b);
		}
		if(minb < maxa){
			System.out.println(0);
		}
		else{
			System.out.println(minb-maxa+1);
		}
	}
}
