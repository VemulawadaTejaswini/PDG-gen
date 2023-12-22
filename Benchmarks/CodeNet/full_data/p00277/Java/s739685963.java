import java.util.*;

public class Main {
	public static void main(String[] args){
		int n, l, r, d, t = 0, x = 0, kiroku = 0, max =0, maxban = 0,max2 = 0, hensu = 0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int[] ten = new int[n];
		int[] byou = new int[n];
		r = scan.nextInt();
		l = scan.nextInt();
		for(int i = 0; i < r; i++){
			d = scan.nextInt();
			t = scan.nextInt();
			x = scan.nextInt();
			if(i == 0){
				kiroku = t;
				byou[0] = t;
			}
			ten[d-1] = ten[d-1] + x;
			//maxbanのひとつまえを入力
			for(int j = 1; j < n; j++){
				if(max < ten[j]){
					max = ten[j];
					maxban = j;
				}
			}
			byou[maxban] = byou[maxban] + t - kiroku;
			kiroku = t;
			hensu = d;
		}
		byou[hensu - 1] = byou[hensu - 1] + (l - t);
		for(int k = 1; k < n; k++){
			if(byou[max2] < byou[k]){
				max2 = k;
			}
		}
		System.out.println(max2 + 1);
	}
}