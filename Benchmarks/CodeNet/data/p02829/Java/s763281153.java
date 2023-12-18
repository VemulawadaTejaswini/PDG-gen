import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int[] ans = {1,2,3};
		for(int i = 0;i<3;i++){
			if(ans[i]!=a&&ans[i]!=b)System.out.println(ans[i]);
		}
	}
}