import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n==-1)break;
			if(n==0){
				System.out.println("0");
			}else{
				int i=-1;
				int j=1;
				while(n>=j){
					j*=4;
					i++;
				}
				j/=4;
	
				int[] ans = new int[i+1];
				for(int k=i;k>=0;k--){
					ans[k] = n/j;
					n %= j;
					j /= 4;
				}
				for(int k=i;k>=0;k--){
					System.out.print(ans[k]);
				}
				System.out.println();
			}
			
		}
		
	}	
}