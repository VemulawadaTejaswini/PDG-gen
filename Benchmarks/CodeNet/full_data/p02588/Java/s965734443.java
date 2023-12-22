import java.util.*;
class Main {

 static boolean isInteger(double number){return Math.ceil(number) == Math.floor(number); }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		Double[] a = new Double[n];

		for(int i=0;i<n;i++){
			a[i] = sc.nextDouble();
		}
			
		int cnt = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
					if(a[i] < a[j]){
						double d = a[i] * a[j];
						if(isInteger(d)){
							cnt++;
						}
					}
			}
		}

		System.out.println(cnt);
	}
}