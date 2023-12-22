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
		int con = 0; 
		int concon = 0;
		int[] br = new int[n];
		boolean flag = true;
		while(flag){
			br[as]++;	
			as = arr[as] -1;
			con++;
			if(br[as] == 2) flag = false;
		}

		for(int i=0; i<br.length; i++){
			if(br[i] ==1) concon ++;
		}
      	
   
		int ans = 0; 
      	if(con < k){
			for(long i =0; i<con-1; i++){
				ans = arr[ans] -1;
			}
			for(long i =0; i<(k-con)%concon; i++){
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