import java.io.*;
import java.util.ArrayList;

public class Main{

	//素数判定
	static boolean be_prime(int x){
		int cnt = 0;
		if(x == 1){
			return true;
		} else {
			for(int i = 1; i <= x; i++){
				if(x % i == 0){
					cnt++;
				}
			}
		}
		if(cnt == 2){
			return true;
		}
		return false;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int x = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);

		//２数の公約数をListに格納
		ArrayList<Integer> common_divisors = new ArrayList<Integer>();
		for(int i = 1; i < Math.min(x, y); i++){
			if(x % i == 0 && y % i == 0){
				common_divisors.add(i);
			}
		}
		System.out.print("common_divisors: ");
		System.out.println(common_divisors);

		//公約数から２つ選び，互いに素か調査
		int cnt = 0;
		if(common_divisors.size() == 0){
			cnt = 0;
		} else if(common_divisors.size() == 1){
			cnt = 1;
		} else {
			for(int div : common_divisors){
				if(be_prime(div)){
					cnt++;
					System.out.println(div);
				}				
			}
		}
		System.out.println(cnt);
	}
}