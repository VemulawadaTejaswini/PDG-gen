import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int q = sc.nextInt();
			
			int[] p = new int[300001];
			for(int i=0;i<n;i++){
				p[sc.nextInt()]++;
			}
			
			int a = 0;
			int k = 0;
			int ans = 0;
			for(int i=0;i<q;i++){
				a = sc.nextInt();
				for(int j=1;j<300001;j++){
					k = 1;
					while(a*k-j<300001){
						if(p[a*k-j]!=0){
							ans = a-j;
							j = 300001;
							break;
						}
						k++;
					}
				}
				System.out.println(ans);
			}
		}
	}	
}