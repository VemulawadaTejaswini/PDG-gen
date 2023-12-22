import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0) break;
			
			int[] p = new int[n+1];
			for(int i=0;i<n;i++) p[i] = sc.nextInt();
			
			int max = 0;
			for(int a=0;a<=n;a++){
				if(p[a]<=m){
					for(int b=0;b<=n;b++){
						if(p[a]+p[b]<=m){
							for(int c=0;c<=n;c++){
								if(p[a]+p[b]+p[c]<=m){
									for(int d=0;d<=n;d++){
										if(p[a]+p[b]+p[c]+p[d]<=m){
											max = Math.max(max, p[a]+p[b]+p[c]+p[d]);
										}
									}
								}
							}
						}
					}
				}
			}
			System.out.println(max);
		}	
	}	
}