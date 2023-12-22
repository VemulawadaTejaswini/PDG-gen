import java.util.Scanner;

public class Main {
	static boolean check(int maskh , int maskw , String arr[] , int K){
		int cnt = 0;
		for(int h = 0 ; h < arr.length ; ++h){
			if((maskh & (1 << h)) != 0){
				continue;
			}
			for(int w = 0 ; w < arr[h].length() ; ++w){
				if(arr[h].charAt(w) == '.'){
					continue;
				}
				if((maskw & (1 << w)) != 0){
					continue;
				}
				++cnt;
			}
		}
		return cnt == K;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		String arr[] = new String[H];
		for(int i = 0 ; i < H ; ++i){
			arr[i] = sc.next();
		}
		int ret = 0;
		for(int i = 0 ; i < (1 << H) ; ++i){
			for(int j = 0 ; j < (1 << W) ; ++j){
				if(check(i , j , arr, K)){
					++ret;
				}
			}
		}
		System.out.println(ret);
	}
}
