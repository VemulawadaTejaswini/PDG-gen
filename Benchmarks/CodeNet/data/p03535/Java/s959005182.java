import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] tmpArray = br.readLine().split(" ");

		int time[] = new int[(n + 1)*2];

		for(int i = 1; i <= n; i++){
			int tmp = Integer.parseInt(tmpArray[i-1]);

			if(tmp != 0 && tmp != 24){
				time[i*2] = tmp;
				time[i*2 + 1] = 24 - tmp;
			}
//			else {
//				time[i*2] = 0;
//				time[i*2 + 1] = 0;
//			}
		}

		//debug
//		for(int i = 0; i < time.length ; i++){
//			System.out.print(time[i]+" ");
//		}
//		System.out.println();

		ArrayList<Diff> diffs = new ArrayList<Diff>();
		for(int i = 0 ; i < n; i++){
			for(int j = i + 1; j <= n; j++){
				for(int k = 0; k < 2; k++){
					for(int l = 0; l < 2; l++){
						diffs.add(new Diff(i, k, j, l, Math.abs(time[i*2 + k] - time[j*2 + l])));
					}
				}
			}
		}

		Collections.sort(diffs);
		//debug
//		for(int i = 0; i < diffs.size(); i++){
//			System.out.print(diffs.get(i).time+" ");
//		}
//		System.out.println();

		//現実的にそのような組み合わせが可能かをチェックする
		for(int i = 0; i < diffs.size(); i++){
			boolean available = true;
			Diff tmpDiff = diffs.get(i);

			int minTime = tmpDiff.time;

			for(int j = 0; j < n; j++){
				if(j == tmpDiff.city1){
					continue;
				}

				int tmpTime = minTime;

				if(j == tmpDiff.city2){
					tmpTime = Math.min(Math.abs(time[j*2 + tmpDiff.c2mode] - time[(j+1)*2 + 0]), tmpTime);
					tmpTime = Math.min(Math.abs(time[j*2 + tmpDiff.c2mode] - time[(j+1)*2 + 1]), tmpTime);
				}
				else if(j + 1 == tmpDiff.city1){
					tmpTime = Math.min(Math.abs(time[j*2 + 0] - time[(j+1)*2 + tmpDiff.c1mode]), tmpTime);
					tmpTime = Math.min(Math.abs(time[j*2 + 1] - time[(j+1)*2 + tmpDiff.c1mode]), tmpTime);
				}
				else {
					tmpTime = Math.min(Math.abs(time[j*2 + 0] - time[(j+1)*2 + 0]), tmpTime);
					tmpTime = Math.min(Math.abs(time[j*2 + 0] - time[(j+1)*2 + 1]), tmpTime);
					tmpTime = Math.min(Math.abs(time[j*2 + 1] - time[(j+1)*2 + 0]), tmpTime);
					tmpTime = Math.min(Math.abs(time[j*2 + 1] - time[(j+1)*2 + 1]), tmpTime);
				}

				if(tmpTime < minTime){
					available = false;
					break;
				}
			}

			if(available){
				System.out.println(minTime%24);
				return;
			}

		}
	}

}

class Diff implements Comparable<Diff>{
	int city1;
	int c1mode;
	int city2;
	int c2mode;
	int time;

	public Diff(int c1, int m1,  int c2, int m2, int time){
		city1 = c1;
		c1mode = m1;
		city2 = c2;
		c2mode = m2;
		this.time = time;
	}

	public int compareTo(Diff d){
		return d.time - this.time;
	}
}