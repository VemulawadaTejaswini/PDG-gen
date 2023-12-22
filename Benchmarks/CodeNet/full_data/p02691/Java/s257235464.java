import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		int ans = 0;
		HashMap<Long,Integer> map = new HashMap<>();
		for(int i=1;i<=n;i++){
			//arr[i]=sc.nextInt();
			arr[i-1] = sc.nextLong();
			// if(map.get(i-h)!=null){
			// 	ans+=map.get(i-h);
			// }
			if(map.get(i+arr[i-1])==null){
				map.put(i+arr[i-1],1);
			}
            else{
				map.put(i+arr[i-1], map.get(i+arr[i-1])+1);
            }
		}
		for(int i=1;i<=n;i++){
			if(map.get(i-arr[i-1])!=null){
				ans=ans+map.get(i-arr[i-1]);
			}
		}
		System.out.println(ans);

	}

		
		
		// int[] arr1 = new int[n+max+1];
		// // //int ans =0;
		// for(int i=0;i<n;i++){
		//  	if(i-arr[i]>=0){
		//  	arr1[i-arr[i]]++;
		//  	}
		// // 	arr1[i+arr[i]]++;
		// }
 
		// for(int i=0;i<n;i++){
		//  	//if(i-arr[i]>=0){
		//  	ans+=arr1[i+arr[i]];
		//  	//}
		// // 	arr1[i+arr[i]]++;
		// }
		
		// // System.out.println(ans);
}
