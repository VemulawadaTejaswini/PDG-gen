import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int[] m = new int[10000];
			int[] t = new int[1];
			int a, b;
			int max = 0;
			for(int i=0;i<n;i++){
				Arrays.fill(m, 0);
				t[0] = 1;
				a = sc.nextInt();
				b = sc.nextInt();
				for(int j=0;j<=a*b;j+=a){
					for(int k=0;k<=max;k++){
						if(t[k]>0) m[j+k] += t[k];
					}
				}
				max += a*b;
				t = m.clone();
			}
			
			int s = sc.nextInt();
			for(int i=0;i<s;i++) System.out.println(m[sc.nextInt()]);
		}	
	}	
}