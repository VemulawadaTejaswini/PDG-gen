import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int q = sc.nextInt();
			int[] sum = new int[n+1];	
			
			int a, v;
			int pans = Integer.MAX_VALUE;
			int max = 0;
			for(int i=0;i<q;i++){
				a = sc.nextInt();
				v = sc.nextInt();
				sum[a] += v;
				
				if(pans==a){
					max = 0;
					for(int j=1;j<=n;j++) max = Math.max(max, sum[j]); 
	                for(int j=1;j<=n;j++){
	                    if(sum[j]==max){
	                    	pans = j;
	                        System.out.println(pans + " " + max);
	                        break;
	                    }
	                }	
				}else{
				
					if(max>sum[a]){
						System.out.println(pans + " " + max);
					}else if(max<sum[a]){
						max = sum[a];
						pans = a;
						System.out.println(pans + " " + max);
					}else if(max==sum[a]){
						if(pans<a){
							System.out.println(pans + " " + max);
						}else{
							pans = a;
							System.out.println(pans + " " + max);
						}
					}
					
				}
			}
		}
	}	
}