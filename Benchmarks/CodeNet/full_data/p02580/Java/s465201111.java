import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s[] = str.split(" ");
		int h = Integer.parseInt(s[0]);
		int w = Integer.parseInt(s[1]);
		int m = Integer.parseInt(s[2]);

		int x[][] = new int[h][w];
		for(int i = 0; i < h; i++){
			for(int j = 0 ; j < w; j++){
				x[i][j]=0;
			}
		}
		for(int i = 0; i < m; i++){
			String str2 = sc.nextLine();
			String s2[] = str2.split(" ");
			x[Integer.parseInt(s2[0])-1][Integer.parseInt(s2[1])-1] = 1;
		}

//		for(int li[] : x){
//			for(int a : li){
//				System.out.print(a);
//			}
//			System.out.println();
//		}
		int max = 0;
		for(int i = 0 ; i < h ; i++){
			for(int j = 0 ; j < w; j++){
				int n = 0;
				for(int k = 0 ; k < w ; k++){
					n += x[i][k];
				}
				for(int k = 0 ; k < h ; k++){
					n += x[k][j];
				}
				n -= x[i][j];
				if(max < n){
					max = n;
//					System.out.println(i + "," + j);
				}
			}
		}
		System.out.println(max);
	}
}