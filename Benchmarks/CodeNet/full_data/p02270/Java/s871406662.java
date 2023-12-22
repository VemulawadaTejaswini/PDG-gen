import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;
	public static final long HUGE_NUM = 99999999999999999L;
	public static final double EPS = 0.000000001;

	public static int W[];
	public static int num_W;
	public static int num_track;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String tmp_str[] = br.readLine().split("\\s+");

			num_W = Integer.parseInt(tmp_str[0]);
			num_track = Integer.parseInt(tmp_str[1]);

			W = new int[num_W];
			long sum = 0;

			for(int i = 0; i < num_W; i++){

				W[i] = Integer.parseInt(br.readLine());
				sum += W[i];
			}

			long left = 0,right = sum,mid = (left+right)/2;
			long ans = right;

			while(left <= right){

				if(is_OK(mid)){

					ans = mid;
					right = mid-1;

				}else{

					left = mid+1;
				}
				mid = (left+right)/2;
			}

			System.out.println(ans);

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	public static boolean is_OK(long P){

		int index_W = 0,index_truck = 0;

		long tmp_sum;

		while(index_W < num_W && index_truck < num_track){

			tmp_sum = 0;
			while(index_W < num_W && tmp_sum+W[index_W] <= P){

				tmp_sum += W[index_W];
				index_W++;
			}
			index_truck++;
		}

		return index_W == num_W;
	}
}

class UTIL{

	//文字が半角数字か判定する関数
	public static boolean isNumber(String tmp_str){
		Pattern pattern = Pattern.compile("\\A[0-9]+\\z");
		Matcher matcher = pattern.matcher(tmp_str);
		return matcher.matches();
	}
}
