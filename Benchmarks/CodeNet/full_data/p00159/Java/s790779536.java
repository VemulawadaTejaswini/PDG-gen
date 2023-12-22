import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			int p, w;
			double h;
			double min = -1;
			double bmi = 0;
			int ans = -1;
			for(int i=0;i<n;i++){
				p = sc.nextInt();
				h = sc.nextInt();
				w = sc.nextInt();
				h /= 100;
				bmi = (double)w/(h*h);
				if(i==0){
					min = Math.abs(22-bmi);
					ans = p;
				}
				else{
					if(Math.abs(22-bmi)<min){
						min = Math.abs(22-bmi);
						ans = p;
					}
				}	
			}
			System.out.println(ans);
		}
	}	
}