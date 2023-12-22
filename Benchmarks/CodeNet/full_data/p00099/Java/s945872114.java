import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int q = sc.nextInt();
			int[] sum = new int[n+1];
			int max = 0;
			
			for(int i=0;i<q;i++){
				sum[sc.nextInt()] += sc.nextInt();
				max = 0;
				for(int j=1;j<=n;j++) max = Math.max(max, sum[j]); 
				for(int j=1;j<=n;j++){
					if(sum[j]==max){
						System.out.println(j + " " + max);
						break;
					}
				}
			}
		}
	}	
}