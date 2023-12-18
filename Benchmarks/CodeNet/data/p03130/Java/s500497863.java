import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] cou = new int[5];
		for(int i = 0; i < 6; i++){
			cou[sc.nextInt()]++;
		}
		boolean flag = false;
		for(int i = 1; i < 5; i++){
			if(cou[i] == 0 || cou[i] > 2){
				flag = true;
			}
		}

		if(!flag){
			System.out.print("YES");
		}else{
			System.out.print("NO");
		}
	}
}
