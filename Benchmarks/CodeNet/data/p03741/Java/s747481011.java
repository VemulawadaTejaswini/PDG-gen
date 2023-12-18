import java.util.*;

public class Main {
	
	public static void main (String[] args){
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		int[] array = new int[N];
		for(int i=0;i<N;i++){
			array[i] = cin.nextInt();
		}
		int res = 0;
		if (array[0] == 0) {
			if (array[1] >= 0) {
				array[0] = -1;
			} else {
				array[0] = 1;
			}
			res++;
		}
		int sum = array[0];
		for (int i=1;i<N;i++){
			int temp = sum + array[i];
			if (temp * sum == 0){
				if (sum > 0) {
					//temp
					array[i]--;
				} else {
					array[i]++;
				}
				res++;
			} else if (temp * sum > 0) {
				if (sum > 0) {
					 //要令temp = -1才行
					res+=Math.abs(-1 - sum - array[i]);
					sum = -1;
				} else {
					res+= Math.abs(1-sum -array[i]);
					sum = 1;
				}
			} else {
				sum = temp;
			}
		}
		System.out.println(res);
	}
}