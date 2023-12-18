import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next()), p, q;
		int[][] map = new int[10][10];
		for(int i = 1; i <= n; i++){
			p = i;
			q = i % 10;
			while(p > 9){
				p /= 10;
			}
			map[p][q]++;
		}
		int cnt = 0;
		for(int i = 1; i <= n; i++){
			p = i;
			q = i % 10;
			while(p > 9){
				p /= 10;
			}
			cnt += map[q][p];
		}
		System.out.println(cnt);
	}
}
