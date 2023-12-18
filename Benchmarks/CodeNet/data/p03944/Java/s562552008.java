import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int w = sc.nextInt();
		// スペース区切りの整数の入力
		int h = sc.nextInt();
		int n = sc.nextInt();
		// 文字列の入力
		int x[] = new int[n];
		int y[] = new int[n];
		int a[] = new int[n];
		int maxx = w;
		int maxy = h;
		int minx = 0;
		int miny = 0;
		for(int i=0; i<n; i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			a[i] = sc.nextInt();
			switch (a[i]){
				case 1:
					if(minx > x[i]){
						minx = x[i];
					}
					break;
				case 2:
				if(maxx < x[i]){
					maxx = x[i];
				}
				break;
				case 3:
				if(miny > y[i]){
					miny = y[i];
				}
				break;
				case 4:
				if(maxy < y[i]){
					maxy = y[i];
				}
				break;
		}
	}
	int answer = (maxx - minx) * (maxy - miny);
		System.out.println(answer);
}
}