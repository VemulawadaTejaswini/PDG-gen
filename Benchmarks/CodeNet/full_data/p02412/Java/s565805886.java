
import java.util.*;

public class Main {
	
	
	
	
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		while(true) {
			int n=cin.nextInt(),x=cin.nextInt();
			int res=0;
			if(n==0 && x==0)break;
			
			for(int i=1;i<=n-2;i++) {
				for(int j=i+1;j<=n-1;j++) {
					for(int k=j+1;k<=n;k++) {
						if(i+j+k==x)res++;
					}
				}
			}
			
			System.out.println(res);
			
		}
	}
	
}
