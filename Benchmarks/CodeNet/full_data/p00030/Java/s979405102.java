import java.util.*;
public class Main {
    static int ans;
     static int n;
    static int dfs(int depth, int sum, int before) {
    	int result = 0;
    	if(depth==0){
    		if(sum==ans)return 1;
    		else return 0;
    	}
    	if(sum>ans)return 0;
    	if(before>9)return 0;
    	for(int i=before;i<=9;i++){
    		result+=dfs(depth-1,sum+i,i+1);
    	}
    	return result;
    }
     
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	while(true){
    		n = in.nextInt();
    		ans = in.nextInt();
    		if(n+ans==0)break;
    		System.out.println(dfs(n,0,0));
    	}
    }
}