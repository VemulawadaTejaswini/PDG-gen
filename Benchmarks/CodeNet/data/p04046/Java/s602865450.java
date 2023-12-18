import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		
		long[] p = new long[w-b];
		
		int i;
		long ans = 0;
	
		for(i=0; i<w-b; i++){
			p[i] = path(h-a-1, w-b+i+1);
			p[i] *= path(a-1, w-b-1-i);
			ans += p[i];
		}
		
		System.out.println(ans);

		
		sc.close();
	}
	
	static long path(int h, int w){
		if(w == 0){
			return 1;
		}else if(w == 1){
			return h+1;
		}
		long path = kai(h+w) / (kai(h) * kai(w));
		return path;
	}
	
	static int kai(int n){
		if(n == 0){
			return 1;
		}else{
			return n * kai(n-1);
		}
	}
}
