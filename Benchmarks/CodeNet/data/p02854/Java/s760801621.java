import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int[] bar = new int[n];
		int min = 999999999;
		
		for(int i =  0;i < bar.length;i++) {
			bar[i] = sc.nextInt();
		}
		for(int i = 0;i < bar.length-1;i++) {
			int[] front = new int[i];
			int[] back = new int[n-i];
			int fn = 0;
			int bn = 0;
			int sum = 0;
			for(int v = 0;v < i;v++) {
				front[v] = bar[v];
			}
			for(int z = i+1;z < back.length;z++) {
				back[z] = bar[z+i];
			}
			for(int x = 0;x < front.length;x++) {
				fn += front[x];
			}
			for(int y = 0;y < back.length;y++) {
				bn += back[y];
			}
			if(fn > bn) {
				min = Math.min(min, up(back,fn));
			}else {
				min = Math.min(min, down(front,bn));
			}
		}
		System.out.println(min);
	}
	
	public static int up(int[] ar,int num){
		int sum = 0;
		int min = 0;
		while(sum != num) {
			for(int i = 0;i < ar.length;i++) {
				ar[i] += 1;
				min+= 1;
				for(int j = 0;j < ar.length;j++) {
					sum += ar[j];
				}
				if(sum == num) {
					break;
				}
				sum = 0;
			}
		}
		return min;
	}
	
	public static int down(int [] ar, int num) {
		int min = 0;
		int sum = 0;
		while(sum != num) {
			for(int i = 0;i < ar.length;i++) {
				if(ar[i] > 1 ) {
					ar[i] -= 1;
					min += 1;
				}
				for(int j = 0;j < ar.length;j++) {
					sum += ar[j];
				}
				if(sum == num) {
					break;
				}
				if(sum == ar.length) {
					return 999999999;
				}
				sum = 0;
			}
		}
		return min;
	}
}
