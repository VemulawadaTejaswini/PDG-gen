import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] tx = new int[n+1];
		for(int i = 0; i < n; i++){
			tx[i] = sc.nextInt();
		}
		if(n == 1){
			System.out.print((int)(Math.abs(tx[0]-x)));
		}else{
			int min = 1000000001;
			tx[n] = x;
			Arrays.sort(tx);
			int num;
			for(int i = 0; i < n; i++){
				num = tx[i+1]-tx[i];
				if(num < min){
					min = num;
				}
			}
			System.out.print(min);
		}
	}
}
