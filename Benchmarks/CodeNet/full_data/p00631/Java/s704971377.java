import java.util.Scanner;
 class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n,count = 0,x,a = 0,sum = 0;
		int deta[] = new int[20],result[] = new int[100];
		while(true){
			n = sc.nextInt();
			if(n == 0) break;
			for(int i = 0; i < n; i++){
				deta[i] = sc.nextInt();
				sum += deta[i];
			}
			for(int i = 0; i < n - 1; i++){
				for(int j = i + 1; j < n; j++){
					if(deta[i] < deta[j]){
						x = deta[i];
						deta[i] = deta[j];
						deta[j] = x;						
					}
				}
			}
			for(int i = 0; i < n; i++){
				if(2*(a + deta[i]) < sum || i == n-1){
					a += deta[i];
				}
			}
			if(2*a > sum){
				result[count] = 2*a - sum;
			} else {
				result[count] = sum - 2*a;
			}
			count++;
			a = 0;
			sum = 0;
		}
		for(int i = 0; i < count; i++){
			System.out.println(result[i]);
		}
	}
 }