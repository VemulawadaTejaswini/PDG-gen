import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0)break;
			
			int[] out = new int[n];
			int count = 0;
			int sum = 0;
			int i = 0;
			while(true){
				count = 0;
				while(true){
					if(out[i]==0)count++;
					if(count==m)break;
					i++;
					if(i==n)i=0;
				}
				
				out[i] = 1;
				sum++;
				if(sum==n-1)break;
			}
			
			for(int j=0;j<n;j++){
				if(out[j]==0){
					System.out.println(j+1);
					break;
				}
			}
		}
	
	}	
}