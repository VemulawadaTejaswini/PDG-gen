import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] line2 = (br.readLine()).split(" ");
		int[] a = new int[n];
		for(int i = 0; i<n ; i++){
			a[i] = Integer.parseInt(line2[i]);
		}
		int q = Integer.parseInt(br.readLine());		
		String[] line4 = (br.readLine()).split(" ");
		int[] m = new int[q];
		for(int i = 0; i<q ; i++){
			m[i] = Integer.parseInt(line4[i]);
		}
		for(int i = 0; i<q ; i++){
			boolean res = isSum(n,a,0,m[i]);
			if(res){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}
	}
	public static boolean isSum(int n,int[] a,int k,int b){	
		if(b==0){
			return true;
		}else if(k==n || b < 0){
			return false;
		}

		boolean judge = (isSum(n,a,k+1,b) || isSum(n,a,k+1,b-a[k]));
		return judge;
	}
}