import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] list = new int[n];
		int[] newList = new int[n];
		int tmpNum;
		for(int i =0; i<n; i++) {
			tmpNum = Integer.parseInt(sc.next());
			list[i] = tmpNum;
			newList[i] = tmpNum;
		}
		Arrays.sort(newList);
		int tmp = list[0];
		int flg = 0;

		int first = 0;
		int firstIndex = 0;
		int last = 0;
		int lastIndex = 0;
		for(int i=1; i<n; i++) {

			if(flg == 1 && list[i] < tmp) {
				last = list[i];
				lastIndex = i;
				flg = 2;
			}

			if(flg == 0 && list[i] < tmp) {
				first = list[i-1];
				firstIndex = i-1;
				flg = 1;
			}
			tmp = list[i];
		}

		if(flg == 2) {
			list[firstIndex] = last;
			list[lastIndex] = first;
		}else if(flg==1){
			list[firstIndex] = list[firstIndex + 1];
			list[firstIndex + 1] = first;
		}
		int judge = 0;
		for(int i=0;i<n;i++) {
			if(list[i] != newList[i]) {
				judge = 1;
			}
		}

		if(judge==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}
}