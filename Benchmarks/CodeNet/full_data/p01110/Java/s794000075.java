
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		for(;;){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int t = sc.nextInt();
			int p = sc.nextInt();
			
			if((n|m|t|p) == 0){
				break;
			}
			
			int d[] = new int[t];
			int c[] = new int[t];
			for(int i =0 ; i < t; i++){
				d[i] = sc.nextInt();
				c[i] = sc.nextInt();
			}
			
			int x[] = new int[p];
			int y[] = new int[p];
			for(int i = 0; i < p; i++){
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}
			
			int left = 0;
			int buttom = 0;
			
			int[] depth1 = new int[n*100];
			int[] depth2 = new int[m*100];
			for(int i = 0; i< n;i++){
				depth1[i] = 1;
			}
			for(int i = 0; i< m;i++){
				depth2[i] = 1;
			}
			
			for(int i = 0 ; i < t; i++){
				if(d[i] == 1){
					left += c[i];
//					System.out.println("-----"+c[i]+" "+d[i]);
					for(int j = 0 ; j < c[i];j++){
//						System.out.println((left-j-1)+" "+(left+j));
						depth1[left+j] += depth1[left - j - 1];
						depth1[left - j - 1] = 0;
					}
				}else{
					buttom += c[i];
					for(int j = 0 ; j < c[i];j++){
						depth2[buttom+j] += depth2[buttom - j - 1];
						depth2[buttom - j - 1] = 0;
					}
				}
			}
			
//			System.out.println(Arrays.toString(depth1));
//			System.out.println(Arrays.toString(depth2));
			for(int i = 0 ; i < p ;i++){
				int xx = x[i]+left;
				int yy = y[i]+buttom;
				
				System.out.println(depth1[xx] * depth2[yy]);
			}
		}
		
	}
}

