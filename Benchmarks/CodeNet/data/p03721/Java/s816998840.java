import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	//回数
		int M = sc.nextInt();	//K番目に小さいかず
		
		int a[] = new int[N];
		int b[] = new int[N];
		
		for (int i=0; i<N; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));

		
		
		int sum = 0;
		for(int i=0; i<N; i++){
			sum = sum+b[i];
		}
		
		int temp[] = new int[sum];
		
		
//		System.out.println(a.length);
		
		int x =0;
		for (int i=0; i<N; i++){
//			System.out.println("loop = "+i);
			for (int j=0; j<b[i]; j++){
				temp[x] = a[i];
//				System.out.println("a[i] = "+a[i]);
				x++;
			}
			
		}
		
		
		
		
		
		
		
		Arrays.sort(temp);
//		System.out.println(Arrays.toString(temp));

		System.out.println(temp[M-1]);
		


	}

}
