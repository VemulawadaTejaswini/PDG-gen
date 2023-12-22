import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int an = sc.nextInt() + 1;
		int bn = sc.nextInt() + 1;
		int maxmin = sc.nextInt();
		long[] a = new long[an];
		long[] b = new long[bn];
		int res = 0;
		for(int i = 0; i < an; i++){
			if(i == 0){
				a[i] = 0;
			}else{
				a[i] = a[i-1] + sc.nextLong();
			}
		}
		for(int i = 0; i < bn; i++){
			if(i == 0){
				b[i] = 0;
			}else{
				b[i] = b[i-1] + sc.nextLong();
			}
		}
		for(int i = 0; i < a.length; i++){
			if(a[i] < maxmin){
				for(int j = 0; j < b.length; j++){
					if(a[i] + b[j] < maxmin){
						if(res < i+j){
							res = i + j;
						}
					}
				}

			}
		}
		System.out.println(res);


	}
}