import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int a_score=0;
		int b_score=0;
		
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int i=0; i<n; i++){
			if(a[i] > b[i]){
				a_score += a[i]+b[i];
			}else if(a[i] == b[i]){
				a_score += a[i];
				b_score += b[i];
			}else{
				b_score += a[i]+b[i];
			}
		}
			
		System.out.println(a_score + " " + b_score);

	}

}