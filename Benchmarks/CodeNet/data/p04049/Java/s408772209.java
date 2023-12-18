import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int pair[][] = new int[n-1][2];
		for(int i=0; i<n-1; i++){
			pair[i][0] = sc.nextInt();
			pair[i][1] = sc.nextInt();
		}
		int nums[] = new int[n];
		for(int i=0; i<n; i++){
			nums[i] = 0;
		}
		for(int i=0; i<n-1; i++){
			for(int j=0; j<2; j++){
				nums[pair[i][j]-1] ++;
			}
		}
		int end = 0;
		for(int i=0; i<n; i++){
			if(nums[i]==1){
				end = i;
				break;
			}
		}
		int deepness[] = new int[n];
		for(int i=0; i<n; i++){
			deepness[i] = -1;
		}
		deepness[end] = 0;
		for(int i=0; i<n-1; i++){
			for(int j=0; j<n-1; j++){
				boolean check1 = deepness[pair[j][0]-1] == -1;
				boolean check2 = deepness[pair[j][1]-1] == -1;
				if(check1!=check2){
					if(check1==true){
						deepness[pair[j][0]-1] = deepness[pair[j][1]-1] + 1;
					}
					else{
						deepness[pair[j][1]-1] = deepness[pair[j][0]-1] + 1;
					}
				}
			}
		}
		int ans = 0;
		for(int i=0; i<n; i++){
			if(deepness[i]>k){
				ans++;
			}
		}
		System.out.println(ans);
	}
}