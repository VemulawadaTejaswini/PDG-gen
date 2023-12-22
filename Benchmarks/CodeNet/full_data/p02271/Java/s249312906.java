import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
	//????????????????????????
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	
	//?????????
	int n = Integer.parseInt(bf.readLine());
	String[] stringA = bf.readLine().split(" ");
	int q = Integer.parseInt(bf.readLine());
	String[] stringM = bf.readLine().split(" ");
	
	int[] intA = new int[n];
	int[] intM = new int[q];
	for(int i=0;i<n;i++){
		intA[i]=Integer.parseInt(stringA[i]);
	}
	for(int i=0;i<q;i++){
		intM[i]=Integer.parseInt(stringM[i]);
	}
	
	for(int i=0;i<q;i++){
		if(solve(0,intM[i],n,intA)){
			System.out.println("yes");	
		}else{
			System.out.println("no");
		}
	}
	}

	
	public static boolean solve(int i,int m,int n,int[] array){
		if(m==0){
			return true;
		}
		if(i >=n){
			return false;
		}
		boolean res = solve(i+1,m,n,array) || solve(i+1,m-array[i],n,array);
		return res;
	}
}