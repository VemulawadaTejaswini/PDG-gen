import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;
	public static final long HUGE_NUM = 99999999999999999L;
	public static final double EPS = 0.000000001;



	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int Q = scanner.nextInt();

		long table[] = new long[N];

		for(int i = 0; i < N; i++){

			table[i] = scanner.nextLong();
		}

		StringBuilder ANS = new StringBuilder();

		for(int i = 0; i < Q; i++){

			long base_num = scanner.nextLong();
			Long ans = 0L;
			int left = 0;

			long tmp_sum = table[left];
			int right = left;

			while(true){
				while(tmp_sum <= base_num){
					ans += right-left+1;
					right++;
					if(right == N)break;
					tmp_sum += table[right];
				}

				if(right == N)break;

				while(tmp_sum > base_num){
					tmp_sum -= table[left];
					left++;
					if(left > right){
						break;
					}
				}

				if(left > right){
					while(left < N && table[left] > base_num){

						left++;
					}
					if(left == N)break;

					tmp_sum = table[left];
					right = left;
				}
			}
			ANS.append(Long.toString(ans)).append("\n");
		}
		System.out.print(ANS.toString());
	}
}

class UTIL{

	//最大公約数
	public static long gcd(long x,long y){

		x = Math.abs(x);
		y = Math.abs(y);

		if(x < y){

			long tmp = y;
			y = x;
			x = tmp;
		}

		if(y == 0){

			return x;
		}else{

			return gcd(y,x%y);
		}
	}

	//最小公倍数
	public static long lcm(long x,long y){

		return (x*y)/gcd(x,y);
	}

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
