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
		int lastIndx =-1;
		for(int i=0;i<blueList.size();i++){
			lastIndx =-1;
			for(int k=0;k<redList.size();k++){
				if(redList.get(k)[0] < blueList.get(i)[0] &&
					redList.get(k)[1] < blueList.get(i)[1]	){
					if(lastIndx == -1 || redList.get(k)[1] > redList.get(lastIndx)[1]){
						lastIndx=k;
					}
				}
			}
			if(lastIndx !=-1){
				ans++;
				redList.remove(lastIndx);
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
