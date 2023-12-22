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


	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			String input_str;
			int num_hit,num_blow;

			while((input_str = br.readLine()) != null){

				String A[] = input_str.split("\\s+");
				String B[] = br.readLine().split("\\s+");

				num_hit = 0;
				num_blow = 0;

				for(int i = 0; i < A.length; i++){
					for(int k = 0; k < B.length; k++){
						if(A[i].equals(B[k])){
							if(i == k){

								num_hit += 1;
							}else{

								num_blow += 1;
							}
							break;
						}
					}
				}

				System.out.printf("%d %d\n",num_hit,num_blow);
			}


		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
    }
}


class UTIL{

    //String→intへ変換
    public static int getNUM(String tmp_str){

        return Integer.parseInt(tmp_str);
    }

    //文字が半角数字か判定する関数
    public static boolean isNumber(String tmp_str){

        if(tmp_str == null || tmp_str.length() == 0){

            return false;
        }

        Pattern pattern = Pattern.compile("\\A[0-9]+\\z");
        Matcher matcher = pattern.matcher(tmp_str);
        return matcher.matches();
    }
}
