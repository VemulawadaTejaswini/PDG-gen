import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long x = in.nextLong();
		long[] num_layer = new long[n+1];
		long[] num_paty = new long[n+1];
		num_layer[0] = 1;
		num_paty[0] = 1;
		for(int i=1;i<=n;i++) {
			num_layer[i] = num_layer[i-1]*2 + 3;
			num_paty[i] = num_paty[i-1]*2 + 1;
		}
		long ans = 0;
		int i = n;
		while(i>=1) {
			if(x==num_layer[i-1]*2+3) {
				ans += num_paty[i-1]*2+1;
				break;
			}else if(x>num_layer[i-1]+2) {
				ans += num_paty[i-1]+1;
				x -= num_layer[i-1]+2;
				i--;
			}else if(x==num_layer[i-1]+2) {
				ans += num_paty[i-1]+1;
				break;
			}else if(x==num_layer[i-1]+1) {
				ans += num_paty[i-1];
				break;
			}else {
				x--;
				i--;
			}
		}
		if(i==0 && x==1) ans++; 
		System.out.println(ans);
		in.close();
	}

}
