import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int cnt = 0;
		int p, q;
		for(int i=0;i<n;i++){
			p = sc.nextInt();
			for(int j=1;j<Integer.MAX_VALUE/2;j++){
				if(p-j<2*j+1) break;
				else if((p-j)%(2*j+1)==0){
					cnt++;
					break;
				}
			}
		}
		System.out.println(n-cnt);
	}	
}