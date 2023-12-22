import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, kg, from, to;
	static int[] bridge;
	public static void main(String[] args) {
		while(read()){
			check();
		}
	}
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)
			return false;
		bridge = new int[231];
		for(int i = 0; i < n; i++){
			kg = sc.nextInt(); from = sc.nextInt(); to = sc.nextInt();
			solve();
		}
		return true;
	}
	static void solve(){
		for(int index = from; index < to; index++){
			bridge[index] += kg;
		}
	}
	static void check(){
		int flag = 0;
		for(int i = 0; i < 231; i++){
			if(bridge[i] > 150){
				flag = 1;
			}
		}
		if(flag == 1){
			System.out.println("NG");
		}else{
			System.out.println("OK");
		}
	}

}