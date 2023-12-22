import java.util.*;

public class Main{
	static final int MAX = 3000000;
	static boolean[] judge = new boolean[MAX];
	static int[] msprimes = new int[317247];

	static void fului_ver2(){
		int multiple;
		int i = 6, cnt = 0;
		msprimes[cnt++] = 1;
		while(i<MAX){
			if(judge[i]){
				msprimes[cnt++] = i;
				multiple = i + i;
				while(multiple<MAX){
					judge[multiple] = false;
					multiple += i;
				}
			}
			if(i%7==6){
				i += 2;
			}else{
				i += 5;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Arrays.fill(judge, true);
		fului_ver2();
		int msnum, i, flag;

		while(true){
			msnum = sc.nextInt();
			if(msnum==1) break;
			System.out.print(msnum + ":");
			i = 1;
			flag = 0;
			while(msprimes[i]<=msnum/6){
				if(msnum%msprimes[i]==0){
					flag = 1;
					System.out.print(" " + msprimes[i]);
				}
				i++;
			}
			if(flag==1){
				System.out.println();
			}else{
				System.out.println(" " + msnum);
			}
		}
	}
}