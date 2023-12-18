import java.util.Arrays;
import java.util.Scanner;

class Main{




	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		int h = sc.nextInt();
		int w = sc.nextInt();

		long ans = 1000000000;
		long[] one = new long[3];
		long[] two = new long[3];


		for(long i = 1;i <= h;i++){
			long score = 0;

			long a = i*w;
			long b = 0;
			long c = 0;

			one[0] = a;

			b = (h-i)*(w/2);
			c = (h-i)*(w-w/2);
			one[1] = b;
			one[2] = c;

			Arrays.sort(one);

			two[0] = a;

			long bb = 0;
			long cc = 0;
			bb = (h-i)/2*w;
			cc = (h-i-(h-i)/2)*w;

			two[1] = bb;
			two[2] = cc;

			Arrays.sort(two);

			
			

			score = Math.min(one[2]-one[0],two[2]-two[0]);
			ans = Math.min(ans,score);

		}
		
		int x = h;
		h = w;
		w = x;
		
		for(long i = 1;i <= h;i++){
			long score = 0;

			long a = i*w;
			long b = 0;
			long c = 0;

			one[0] = a;

			b = (h-i)*(w/2);
			c = (h-i)*(w-w/2);
			one[1] = b;
			one[2] = c;

			Arrays.sort(one);

			two[0] = a;

			long bb = 0;
			long cc = 0;
			bb = (h-i)/2*w;
			cc = (h-i-(h-i)/2)*w;

			two[1] = bb;
			two[2] = cc;

			Arrays.sort(two);

			
			score = Math.min(one[2]-one[0],two[2]-two[0]);
			ans = Math.min(ans,score);

		}
		
		System.out.println(ans);






	}

}

