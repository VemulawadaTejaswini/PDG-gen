import java.util.Scanner;

public class Main {

	public static void sout_data (int[][] data,int s,int e) {
		int pivot = data[0][s];
		
		int r = s;
		int l = e;
		if(e - s < 2) {
			if(data[0][s] > data[0][e]) {
				int change = data[0][r];
				data[0][r] = data[0][l];
				data[0][l] = change;
				
				change = data[1][r];
				data[1][r] = data[1][l];
				data[1][l] = change;
			}
			return;
		}
		
		while(r < l) {
			while(r < e && pivot > data[0][r]){
				r++;
			}
			while(l > s && pivot <= data[0][l]){
				l--;
			}
			if(l <= r) {
				break;
			}
			int change = data[0][r];
			data[0][r] = data[0][l];
			data[0][l] = change;
			
			change = data[1][r];
			data[1][r] = data[1][l];
			data[1][l] = change;
		}
		
			sout_data(data,s,l);
			sout_data(data,r,e);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] data = new int[2][N];
		long result = 0;
		int count = 0;
		boolean flag = true;
		
		for(int i = 0; i < N; i++) {
			 data[0][i] = sc.nextInt();
			 data[1][i] = sc.nextInt();
		}
		
		sout_data(data,0,N-1);
		
		int i = 0;
		while(flag) {
			for(int j = 0; j < data[1][i]; j++) {
				result += data[0][i];
				count++;
				if(M == count) {
					flag = false;
					break;
				}
			}
			i++;
		}
		System.out.println(result);
	}
}
