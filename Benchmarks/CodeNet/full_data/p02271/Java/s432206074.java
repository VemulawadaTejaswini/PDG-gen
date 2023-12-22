import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
			int N = sc.nextInt();
			int[] arr = new int[N];
			for(int i=0;i<arr.length;i++){
				arr[i] = sc.nextInt();
			}
			int q = sc.nextInt();
			int[] target = new int[q];
			for(int i=0;i<q;i++){
				target[i] = sc.nextInt();
			}
			for(int i=0;i<q;i++){
				List<Integer> path = new ArrayList<Integer>();
				List<List<Integer>> res = new ArrayList<List<Integer>>();
				dfs(arr,target[i],path,res,0);
				if(res.size()>0){
					System.out.println("yes");
				}else{
					System.out.println("no");
				}
			}
		}
	}
	public static void dfs(int[] nums,int target,List<Integer> path,List<List<Integer>> res,int index){
		if(res.size()>0) return;
		if(target==0){
			res.add(new ArrayList<Integer>(path));
		}
		if(target<0 || index>=nums.length){
			return ;
		}
		for(int i=index;i<nums.length;i++){
			path.add(nums[i]);
			dfs(nums,target-nums[i],path,res,i+1);
			path.remove(path.size()-1);
		}
	}
}