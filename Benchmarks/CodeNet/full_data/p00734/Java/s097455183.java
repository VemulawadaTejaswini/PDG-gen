import java.util.*;

public class Main {
	
	private void doit() {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0){
				break;
			}
			int sum1 = 0;
			int sum2 = 0;
			int [] data1 = new int[n];
			int [] data2 = new int[m];
			for(int i =0; i < n; i++){
				data1[i] = sc.nextInt();
				sum1 += data1[i];
			}
			for(int i =0; i < m; i ++){
				data2[i] = sc.nextInt();
				sum2 += data2[i];
			}
			int ans= Integer.MAX_VALUE, a1=0, a2= 0;
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
					if(sum1 - data1[i] + data2[j] == sum2 - data2[j] + data1[i]){
						if(ans > data1[i] + data2[j]){
							ans = data1[i] + data2[j];
							a1 = i;
							a2 = j;
						}
					}
				}
			}
			if(ans == Integer.MAX_VALUE){
				System.out.println(-1);
			}
			else{
				System.out.println(data1[a1] + " " + data2[a2]);
			}
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}