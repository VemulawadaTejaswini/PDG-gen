import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static int count = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n,s;
		while(true){
			String info[] = br.readLine().split(" ");
			n = Integer.parseInt(info[0]);
			s = Integer.parseInt(info[1]);


			if(n == 0 && s == 0){
				break;
			}

			solve(n,s,0);
			System.out.println(count);
			count = 0;
		}
	}

	private static void solve(int n,int s,int num){

		if(num > 9 || n == 0 || num > s){
			return;
		}

		if(n == 1 &&  s == num){
			count++;
		}

		solve(n - 1,s - num, num + 1);
		solve(n,s,num + 1);
	}

}