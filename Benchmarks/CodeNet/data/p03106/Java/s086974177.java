import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		
		int c=K;
		int d =0;
		
		if(A < B){
			for(int i=1;i <=B;i++){
				if(A%i==0 && B%i==0){
					d++;
					if(d==c){
						d =i;
					}
				}
			}
		}
		
		if(A > B){
			for(int i=1;i <=A ;i++){
				if(A%i==0 && B%i==0){
					d++;
					if(d==K){
						d =i;
					}
				}
			}
		}
		
		System.out.println(d);
		

	}

}
