import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n == 0){
				break;
			}
			int ii[] = new int[n];
			int c = 0;
			for(int i = 0;i < 1; ++i){
				int x = ii[i] = in.nextInt();
				int y = 1;
				for(int j = i+1;j < n; ++j){
					if(x == (ii[j] = in.nextInt())){
						ii[j] = -1;
						++y;
					}
				}
				c += y;
				if(y > n/2){
					System.out.println(ii[i]);
					break;
				} else {

					if(c > n/2){
						System.out.println("NO COLOR");
						break;
					}
				}
			}
			if(c > n/2){
				break;
			}
			for(int i = 1;i < n/2; ++i){
				int x = ii[i];
				if(x == -1){
					continue;
				}
				int y = 1;
				for(int j = i+1;j < n; ++j){
					if(x == ii[j]){
						++y;
					}
				}
				if(y > n/2){
					System.out.println(ii[i]);
					break;
				} else {
					c += y;
					if(c > n/2){
						System.out.println("NO COLOR");
						break;
					}

				}
			}
			System.err.println("\t\tEND");
		}
	}
}