import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		if((isGPA(a) && isGPA(b)) || (isGPB(a) && isGPB(b)) || (a == 2 && b == 2)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	public static boolean isGPA(int num){
		int[] CNT = {1,3,5,7,8,10,12};
		for(int n : CNT){
			if(n == num){
				return true;
			}
		}
		return false;
	}

	public static boolean isGPB(int num){
		int[] CNT = {4,6,9,11};
		for(int n : CNT){
			if(n == num){
				return true;
			}
		}
		return false;
	}
}