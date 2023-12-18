import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static int[] gs = new int[]{100,101,102,103,104,105};
	private static int[] ary1 = new int[1000000];
	private static int[] ary2 = new int[1000000];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();

		for(int i = 0;i < 1000;i++){
			for(int j = 0;j < 991;j++){
				ary1[i*1000+j]=gs[0]*i + gs[1]*j;
			}
		}
		Arrays.sort(ary1);
		for(int i = 0;i < 981;i++){
			for(int j = 0;j < 971;j++){
				ary2[i*1000+j]=gs[2]*i + gs[3]*j;
			}
		}
		Arrays.sort(ary2);
		for(int k = 0;k < 981;k++){
			for(int l = 0;l < 971;l++){
				if(binarySearch(X-(gs[2]*k)-(gs[3]*l), X, ary1)){
					for(int m = 0;m < 962;m++){
						for(int n = 0;n < 953;n++){
							if(binarySearch(X-(gs[4]*m)-(gs[5]*n), X, ary2)){
								System.out.println(1);
								return;
							}
						}
					}
				}
			}
		}
		System.out.println(0);
	}
	private static boolean binarySearch(int x, int n, int[] kk){
		int left = 0;
		int right = n;
		while(right - left > 1){
			int mid = (left + right)/2;
			if(kk[mid] == x){
				return true;
			}else if(x > kk[mid]){
				left = mid;
			}else{
				right = mid;
			}
		}
		return false;
	}
}