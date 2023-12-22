import java.util.*;
import java.io.*;

public class Ball{
	static int a = 0; //??????????????¢??°
	static int b = 0;
	static int n;
	static int[][] input;
	public static void main(String[] args)throws IOException{
	Scanner sc = new Scanner(System.in);
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	n = sc.nextInt();
	input = new int[n][10];
	for(int i = 0;i < input.length;i++){
		for(int j = 0;j < 10;j++){
			input[i][j] = Integer.parseInt(sc.next());
		}
	}
	for(int i = 0;i < input.length;i++){
		if(dfs(0,input[i])){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
	}
	
	static boolean dfs(int i,int[] k){
		if(i == 10) return a == k[9] || b == k[9];
		if(k[i] > a){
			a = k[i];
		}else if(k[i] > b){
			b = k[i];
		}
		if(dfs(i+1,k)) return true;
		return false;
	}
}