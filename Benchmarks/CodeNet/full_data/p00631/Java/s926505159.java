import java.util.Scanner;
 class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n,count = 0,x,a = 0,b = 0;
		int deta[] = new int[20],result[] = new int[100];
		while(true){
			n = sc.nextInt();
			if(n == 0) break;
			for(int i = 0; i < n; i++){
				deta[i] = sc.nextInt();
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
				if(a <= b){
					a += deta[i];
				} else {
					b += deta[i];
				}
			}
			if(a > b){
				result[count] = a - b;
			} else {
				result[count] = b - a;
			}
			count++;
			a = 0;
			b = 0;
		}
		for(int i = 0; i < count; i++){
			System.out.println(result[i]);
		}
	}
 }