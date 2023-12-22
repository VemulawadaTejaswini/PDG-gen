import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n, i;
		int s[] = new int[1000];
		double myu, bunsan;
		ArrayList<Double> sigma = new ArrayList<Double>();
		
		while(true){
			myu = 0;
			bunsan = 0;
			n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			for(i = 0; i < n; i++){
				s[i] = sc.nextInt();
				myu += s[i];
			}
			
			myu /= n;
			
			for(i = 0; i < n; i++){
				bunsan += Math.pow((s[i] - myu), 2);
			}
			bunsan /= n;
			sigma.add(Math.abs(Math.sqrt(bunsan)));
		}
		
		for(double d : sigma){
			System.out.println(d);
		}
	}
}