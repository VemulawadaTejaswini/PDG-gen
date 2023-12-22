import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int ans = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++){
			//arr[i]=sc.nextInt();
			arr[i] = sc.nextInt();
			// if(map.get(i-h)!=null){
			// 	ans+=map.get(i-h);
			// }
			if(map.get(i+arr[i])==null){
				map.put(i+arr[i],1);
			}
            else{
				map.put(i+arr[i], map.get(i+arr[i])+1);
            }
		}
		for(int i=0;i<n;i++){
			//if(map.get(i-arr[i])!=null){
				ans=ans+map.getOrDefault(i-arr[i],0);
			//}
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
