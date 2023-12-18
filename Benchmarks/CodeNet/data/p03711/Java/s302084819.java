import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	static int[] a1 = {1,3,5,7,8,10,12};
	static int[] a2 = {4,6,9,11};
	static int[] a3 = {2};
	
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strs = br.readLine().split(" ");
		int x = Integer.parseInt(strs[0]);
		int y = Integer.parseInt(strs[1]);
		
		if(search(x) == search(y)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}
	
	public static int search(int x){
		for(int a : a1){
			if(a == x){
				return 1;
			}
		}
		for(int a : a2){
			if(a == x){
				return 2;
			}
		}
		for(int a : a3){
			if(a == x){
				return 3;
			}
		}
		
		
		return -1;
	}
}
