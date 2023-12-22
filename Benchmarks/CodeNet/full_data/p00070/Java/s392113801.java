/**
 * 
 */
import java.util.*;
/**
 * @author akira
 *
 */
class Main {

	static int n, s;
	static int[][] mem = new int[1 << 10][10001];
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()){
			n = scan.nextInt();
			s = scan.nextInt();
			for(int i = 0;i < mem.length;i++){
				for(int j = 0;j < mem[i].length;j++){
					mem[i][j] = -1;
				}
			}
			System.out.println("" + rec(0,0,0));
		}
	}
	static int rec(int cnt,int set,int sum){
//		System.out.println("" + cnt + " " + set + " " + sum);
//		System.out.flush();
		if(sum > s){
			return 0;
		}else if(cnt == n){
			if(sum == s){
				return 1;
			}else{
				return 0;
			}
		}else if(mem[set][sum] != -1){
			return mem[set][sum];
		}
		int res = 0;
		for(int i = 0;i < 10;i++){
			if(((set >> i) & 1) == 0){
				res += rec(cnt + 1,set | (1 << i),sum + i * (cnt + 1));
			}
		}
		return mem[set][sum] = res;
	}

}