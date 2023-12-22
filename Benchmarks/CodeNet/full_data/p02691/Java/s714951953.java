import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int ans = 0;
		HashMap<Long,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++){
			long h = sc.nextLong();
			if(map.get(i-h)!=null){
				ans+=map.get(i-h);
			}
			if(map.get(i+h)==null){
				map.put(i+h,1);
			}
			else{
				map.put(i+h, map.get(i+h)+1);
			}
		}
		System.out.println(ans);
		// int[] arr1 = new int[n+max+1];
		// //int ans =0;
		// for(int i=0;i<n;i++){
		// 	if(i-arr[i]>=0){
		// 		ans+=arr1[i-arr[i]];
		// 	}
		// 	arr1[i+arr[i]]++;
		// }
		// System.out.println(ans);
	}
}