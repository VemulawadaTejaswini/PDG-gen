import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, m;
	static int[] taro, hanako;
	static int[][]ans;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		m = sc.nextInt();
		taro = new int[n];
		hanako = new int[m];
		for(int i = 0; i < taro.length; i++){
			taro[i] = sc.nextInt();
		}
		for(int i = 0; i < hanako.length; i++){
			hanako[i] = sc.nextInt();
		}
		return true;
	}
	
	static void solve(){
		boolean f = false;
		int sum = 200;
		int[] res = new int[2];
		for(int i = 0; i < taro.length; i++){
			int t = taro[i];
			for(int j = 0; j < hanako.length; j++){
				int h = hanako[j];
				hanako[j] = t;
				taro[i] = h;
				int taroSum = 0, hanakoSum = 0;
				for(int k = 0; k < taro.length; k++){
					taroSum += taro[k];
				}
				for(int k = 0; k < hanako.length; k++){
					hanakoSum += hanako[k];
				}
				if(taroSum == hanakoSum){
					f = true;
					if(sum > t + h){
						res[0] = t;
						res[1] = h;
						sum = t+h;
					}
				}
				hanako[j] = h;
			}
			taro[i] = t;
		}
		if(f){
			System.out.println(res[0] + " " + res[1]);
		}else{
			System.out.println(-1);
		}
	}
}