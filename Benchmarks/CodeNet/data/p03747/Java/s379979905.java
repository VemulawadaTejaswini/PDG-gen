import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int l = sc.nextInt();
		int t = sc.nextInt();
		int x[] = new int[n];
		int w[] = new int[n];
		for(int i = 0; i < n; i++){
			x[i] = sc.nextInt();
			w[i] = sc.nextInt();
		}
		
		int count = 0;
		for(int i = 0; i < n; i++){
			if(w[0] != w[i]){
				count += (t - (x[i] - x[0]) / 2) / l +1;
			}
		}
		count = count % n;
		if(w[0] == 2){
			count = n-count;
		}
		
		int answer[] = new int[n];
		for(int i = 0; i < n; i++){
			if(w[i] == 1){
				answer[i] = (x[i] + t) % l;
			}else{
				answer[i] = (x[i] - t) % l;
				if(answer[i] < 0){
					answer[i] += l;
				}
			}
		}
		
		int a = answer[n-1];
		for(int i = 0; i < count ; i++){
			for(int j = n-1; j > 0; j--){
				answer[j] = answer[j-1];
			}
		}
		answer[0] = a;
		
		for(int i = 0; i < n; i++){
			System.out.println(answer[i]);
		}
	}
}