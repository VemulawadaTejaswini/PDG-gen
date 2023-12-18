import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static int gcd(int a, int b){
        if(b == 0) return a;
        else return gcd(b , a%b);
    }

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] num = new int[n];

		for(int i=0;i<n;i++) {
			num[i] = Integer.parseInt(str[i]);
		}

		int maxval = 0;


		for(int k=0;k<n;k++) {

			int val = 0;

			for(int i=0;i<n;i++) {
				if(i!=k) {
					if(val>=num[i]) {
						val = gcd(val,num[i]);
					}else {
						val = gcd(num[i],val);
					}
				}


			}

			maxval = Math.max(val,maxval);

		}
		System.out.println(maxval);

	}

}
