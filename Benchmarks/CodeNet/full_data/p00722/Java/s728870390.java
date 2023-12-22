import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		
		boolean[] hurui = new boolean[1000001];
		
		for(int i = 0; i <= 1000000; i++){
			if(i == 0 || i == 1){
				hurui[i] = false;
			}else{
				hurui[i] = true;
			}
		}
		
		for(int i = 2; i <= 1000000; i++){
			if(hurui[i] == true){
				int sum = i;
				while(sum <= 1000000){
					sum = sum + i;
					if(sum < 1000000){
						hurui[sum] = false;
					}
				}
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			int count = 0;
			int count2 = 0;
			
			for(int i = 0; i <= 100; i++){
				if(hurui[i] == true){
					count++;
				}
			}
			
			for(int i = 0; i <= 1000000; i++){
				if(hurui[i] == true){
					count2++;
				}
			}

			
			int a = sc.nextInt();
			int d = sc.nextInt();
			int n = sc.nextInt();
			
			if(a == 0 && d == 0 && n == 0){
				break;
			}
			
			int sum2 = 0;
			
			while(true){
				if(hurui[a] == true){
					sum2++;
					if(sum2 == n){
						System.out.println(a);
						break;
					}
				}
				a = a + d;
			}
			
			
		}
	}

}