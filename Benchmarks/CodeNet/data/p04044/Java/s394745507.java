import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		int n = Integer.parseInt(strs[0]);
		int len = Integer.parseInt(strs[1]);
		
		strs = new String[n];
		for(int i = 0 ; i < n ; i++){
			strs[i] = br.readLine();
		}
		
		for(int i = 0 ; i < strs.length ; i++){
			for(int j = i+1 ; j < strs.length ; j++){
				int cmp = strcmp(strs[i],strs[j]);
				if(cmp == -1){
					String b = strs[i];
					strs[i] = strs[j];
					strs[j] = b;
				}
			}
		}
		String res = "";
		for(int i = 0 ; i < strs.length ; i++){
			res += strs[i];
		}
		
		System.out.println(res);
		
	}
	//1:< 0:== -1:>
	static int strcmp(String left,String right){
		int len = Math.min(left.length(),right.length());
		
		for(int i = 0 ; i < len ; i++){
			if(left.charAt(i) > right.charAt(i)){
				return -1;
			}else
			if(left.charAt(i) < right.charAt(i)){
				return 1;
			}
		}
		
		if(left.length() > right.length()){
			return -1;
		}else
		if(left.length() < right.length()){
			return 1;
		}
		
		return 0;
	}
}
