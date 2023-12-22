import java.util.*;

public class Main{
//public class abc167_d{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long k = scan.nextLong();

		int[] arr = new int[n];

		for(int i =0; i<n; i++){
			arr[i] = scan.nextInt();
		}

		int as = 0;
		long con = 0; 
		long concon = 0;
		long a = 0;
		int[] br = new int[n];
		boolean flag = true;
		while(flag){
			br[as]++;	
			as = arr[as] -1;
			con++;
			if(br[as] == 1) a = con;
			if(br[as] == 2) flag = false;
		}

		for(int i=0; i<br.length; i++){
			if(br[i] ==1) concon ++;
		}
      	
   		a = a -concon;
		int ans = 0; 
		if(k > a){
			for(long i =0; i<a; i++){
				ans = arr[ans] -1;
			}
			for(long i =0; i<(k-a)%concon; i++){
				ans = arr[ans] -1;
			}
		}else{
			for(long i =0; i<k; i++){
				ans = arr[ans] -1;
			}
		}
      
      	ans ++;
		System.out.println(ans);
		
	}

}