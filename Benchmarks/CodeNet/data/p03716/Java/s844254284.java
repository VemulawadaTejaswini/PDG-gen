import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [] a = new int[n];
			int [] b = new int[n];
			int [] c = new int[n];
			long suma = 0, sumb = 0, sumc = 0;
			for(int i = 0; i < n;i++){
				a[i] = sc.nextInt();
				suma += a[i];
			}
			for(int i = 0; i < n;i++){
				b[i] = sc.nextInt();
				sumb += b[i];
			}
			for(int i = 0; i < n;i++){
				c[i] = sc.nextInt();
				sumc += c[i];
			}
			Arrays.sort(a);
			for(int i = 1; i < n;i++){
				a[i] = a[i] + a[i-1]; 
			}
			
			Arrays.sort(c);
			for(int i = 0; i < n / 2; i++){
				int temp = c[i];
				c[i] = c[n -1 -i];
				c[n - 1 - i] = temp;
			}
			for(int i = 1; i < n;i++){
				c[i] = c[i] + c[i-1]; 
			}
	
			
			long ans = Integer.MIN_VALUE;
			for(int i = 1; i < n;i++){
				long adda = 0;
				for(int j = 0; j < i;j++){
					adda += b[j];
				}
				long addc = sumb - adda;
				
				long resa = suma + adda - a[i-1];
				long resc = sumc + addc - c[n-i-1];
				
				ans = Math.max(ans, resa - resc);
			}
			ans = Math.max(ans, suma - sumb);
			ans = Math.max(ans, sumb - sumc);
			System.out.println(ans);

		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
