
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
	
	Scanner sc = new Scanner(System.in);
	
	void run(){
		int k = sc.nextInt();
		int a[] = new int[k];
		for(int i = 0; i< k ;i++){
			a[i] = sc.nextInt();
		}
		
		int min = a[k-1];
		int max = a[k-1] + a[k-1]-1;
		
		for(int j = k-2; j >= 0 ;j--){
			int min2 = min;
			int max2 = max;
			
//			System.out.println(min2+" "+max2);

			min = 0;
			for(int i = min2; i <= max2;i++){
				if(i % a[j]==0 ){
					min = i;
					break;
				}
			}
			if(min == 0){
				System.out.println(-1);
				return;
			}
			
			max = 0;
			for(int i = max2 ; i >= min2 ; i--){
				if(i % a[j] == 0){
					max = i + a[j]-1;
					break;
				}
			}
			if(max == 0){
				System.out.println(-1);
				return;
			}

//			System.out.println(min+" "+max);
		}
		System.out.println(min+" "+max);
	}
}
