import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Solver().run();
	}

}

class Solver{
	private Scanner sc;
	
	public void run(){
		sc = new Scanner(System.in);
		int result = 0; 
		
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) a[i]=sc.nextInt();
		
		int sum = 0;
		boolean flag = true;
		for(int i=0; i<n; i++){
			sum += a[i];
			
			if(sum == 0) break;
			else if(i == 0){
				if(0 < sum) flag = true;
				else if(sum < 0) flag = false;
			}
			else if(0 < sum && flag == false) flag = true;
			else if(sum < 0 && flag == true) flag = false;
			else break;
			
			if(i == n-1){
				System.out.println("0");
				System.exit(0);
			}
		}
		
		sum = 0;
		for(int i=0; i<n; i++){
			sum += a[i];
			
			if(i == 0){
				if(0 < sum) flag = true;
				else if(sum < 0) flag = false;
			}else if(flag == false){
				if(sum < 0){
					result += 0-sum+1;
					sum = 1;
				}else if(sum == 0){
					result += 1;
					sum = 1;
				}
				flag = true;
			}else if(flag == true){
				if(0 < sum){
					result += sum+1;
					sum = -1;
				}else if(sum == 0){
					result += 1;
					sum = -1;
				}
				flag = false;
			}
			
		}
		
		System.out.println(result);
	}
}
