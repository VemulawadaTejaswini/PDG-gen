import java.util.Scanner;
public class DMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] x = new int[n];
		int[] d = new int[n];
		for(int i=0; i<n; i++){
			x[i] = sc.nextInt();
			if(i==0){
				d[i] = 0;
			}else{
				d[i] = x[i] - x[i-1];
			}
		}
		sc.close();
		
		long ans = 0;
		for(int i=1; i<n; i++){
			if(d[i] * a > b){
				ans += b;
			}else{
				ans += a * d[i];
			}
		}
		
		System.out.println(ans);
		
	}

}
