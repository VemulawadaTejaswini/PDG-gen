import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		long N = toLong(in);
		ArrayList<long[]> redList = new ArrayList<long[]>();
		ArrayList<long[]> blueList = new ArrayList<long[]>();
		for(int i=0;i<N;i++){
			long[] tmp = toLongArray(in);
			redList.add(tmp);
		}
		for(int i=0;i<N;i++){
			long[] tmp = toLongArray(in);
			blueList.add(tmp);
		}
		redList.sort(new Comparator<long[]>() {
			@Override
			public int compare(long[] o1, long[] o2) {
				return (int)(o1[0] - o2[0]);
			}
		});
		blueList.sort(new Comparator<long[]>() {
			@Override
			public int compare(long[] o1, long[] o2) {
				return (int)(o1[0] - o2[0]);
			}
		});

		long ans =0;
		int redIndx =0;
		int blueIndx = 0;
		while(redIndx < redList.size() && blueIndx < blueList.size()){
			if(redList.get(redIndx)[0] < blueList.get(blueIndx)[0] &&
					redList.get(redIndx)[1] < blueList.get(blueIndx)[1]){
				redIndx++;
				blueIndx++;
				ans++;
			}else{
				//赤と青のどちらを移動したほうが移動距離が短いかチェックする
				int tmpRIndx = redIndx+1;
				int tmpBIndx = blueIndx;
				int rDist = 1;
				while(tmpRIndx < redList.size() && tmpBIndx < blueList.size()){
					if(redList.get(tmpRIndx)[0] < blueList.get(tmpBIndx)[0] &&
							redList.get(tmpRIndx)[1] < blueList.get(tmpBIndx)[1]){
						break;
					}
					tmpRIndx++;
					rDist++;
				}

				int tmpRIndx2 = redIndx;
				int tmpBIndx2 = blueIndx+1;
				int bDist = 1;
				while(tmpRIndx2 < redList.size() && tmpBIndx2 < blueList.size()){
					if(redList.get(tmpRIndx2)[0] < blueList.get(tmpBIndx2)[0] &&
							redList.get(tmpRIndx2)[1] < blueList.get(tmpBIndx2)[1]){
						break;
					}
					tmpBIndx2++;
					bDist++;
				}
				if(tmpRIndx >= redList.size() && tmpBIndx2 >= blueList.size()){
					break;
				}
				if(rDist < bDist){
					redIndx=tmpRIndx;
				}else{
					blueIndx=tmpBIndx2;
				}
				ans++;
			}
		}
		System.out.println(ans);
	}


	public static String[] readLineArray(BufferedReader in) throws Exception{
		return in.readLine().split(" ");
	}

	public static long[] toLongArray(String[] tmp) throws Exception{
		long[] ret = new long[tmp.length];
		for(int i=0;i<tmp.length;i++){
			ret[i] = Long.parseLong(tmp[i]);
		}
		return ret;
	}
	public static long[] toLongArray(BufferedReader in) throws Exception{
		return toLongArray(readLineArray(in));
	}
	public static String readLine(BufferedReader in) throws Exception{
		return in.readLine();
	}
	public static long toLong(String tmp) throws Exception{
		long ret = Long.parseLong(tmp);
		return ret;
	}
	public static long toLong(BufferedReader in) throws Exception{
		return toLong(readLine(in));
	}



}
