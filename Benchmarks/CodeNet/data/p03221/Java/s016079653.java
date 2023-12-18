import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int N,M;
	static int PYarr[][];
	
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		PYarr = new int[M][3];
		for(int i = 0; i < M;i++){
			st = new StringTokenizer(br.readLine());
			PYarr[i][0] = Integer.parseInt(st.nextToken());
			PYarr[i][1] = Integer.parseInt(st.nextToken());
			PYarr[i][2] = i;
		}
		quick_sorc(0,M-1,0);
		int p = PYarr[0][0];
		int num = 1;
		for(int i = 0; i < M;i++){
			if(p ==  PYarr[i][0]) {
				PYarr[i][1] = num;
				num++;
			}else {
				p = PYarr[i][0];
				num = 1;
				PYarr[i][1] = num;
				num++;
			}
		}
		quick_sorc(0,M-1,1);
		String P,X;
		for(int i = 0; i < M;i++){
			P = String.format("%06d", PYarr[i][0]);
			X = String.format("%06d", PYarr[i][1]);
			StringBuffer sb = new StringBuffer("");
			sb.append(P);
			sb.append(X);
			System.out.println(sb.toString());
		}
	}
	
	public static void quick_sorc(int start, int end, int flag) {
		if (start < end) {
			// 快排
			int p = random_partition(start, end, flag);
			quick_sorc(start, p - 1, flag);
			quick_sorc(p + 1, end, flag);
		}
	}

	public static int partition(int s, int e, int flag) {
		int i = s;
		if(flag == 0) {
			for (int j = s; j <= e - 1; j++) {
				if (PYarr[e][0] > PYarr[j][0]) {
					swp(i, j);
					i++;
				}else if(PYarr[e][0] == PYarr[j][0]){
					if (PYarr[e][1] > PYarr[j][1]) {
						swp(i, j);
						i++;
					}
				}
			}
			swp(i, e);
			return i;
		}else {
			for (int j = s; j <= e - 1; j++) {
				if (PYarr[e][2] > PYarr[j][2]) {
					swp(i, j);
					i++;
				}
			}
			swp(i, e);
			return i;
		}
	}

	public static int random_partition(int s, int e,int flag) {
		int i = myrandom(s, e);
		swp(i, e);
		return partition(s, e,flag);
	}

	public static int myrandom(int s, int e) {
		return (int) (s + Math.random() * (e - s + 1));
	}
	
	// 交换
	public static void swp(int a,int b) {
		int temp[] = PYarr[a];
		PYarr[a] = PYarr[b];
		PYarr[b] = temp;
	}
}