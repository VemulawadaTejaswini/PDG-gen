
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] ary = new String[n];
		for(int i = 0; i < n; i++){
			ary[i] = sc.next();
		}
		Arrays.sort(ary);
		String before = "";
		int sameNum = 0;
		int maxNum = 0;
		int tieNum = 0;
		Integer[][] mtr = new Integer[n][n];
		
		before = ary[0];
		mtr[sameNum][tieNum] = 0;
		for(int i = 1; i < n; i++){
			if(before.equals(ary[i])){
				sameNum++;
				if(maxNum == sameNum){
					tieNum++;
				}
				if(maxNum < sameNum){
					maxNum = sameNum;
					tieNum = 0;
				}
			}else{
				if(maxNum == 0){
					tieNum++;
				}else{
					sameNum = 0;
				}
			}
			mtr[sameNum][tieNum] = i;
			before = ary[i];
		}
		for(int i = 0; i <= tieNum; i++){
			System.out.println(ary[mtr[maxNum][i]]);
		}
	}
}
