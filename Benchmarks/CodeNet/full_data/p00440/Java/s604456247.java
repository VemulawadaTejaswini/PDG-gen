import java.util.ArrayDeque;
import java.util.Queue;
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

		int SIZE = 100005;
		boolean table[] = new boolean[SIZE];
		boolean zero_FLG = false;

		StringBuilder ans = new StringBuilder();
		Queue<Info> Q = new ArrayDeque<Info>();

		while(true){

			int N = scanner.nextInt();
			int K = scanner.nextInt();

			if(N == 0 && K == 0)break;

			Q.clear();

			zero_FLG = false;

			for(int i = 1; i <= N; i++){

				table[i] = false;
			}

			for(int loop = 0; loop < K; loop++){

				int tmp = scanner.nextInt();
				if(tmp != 0){

					table[tmp] = true;

				}else{

					zero_FLG = true;
				}
			}

			int maximum = 0,count;
			for(int i = 1; i <= N; ){
				if(!table[i]){

					i += 1;
					continue;
				}
				for(count = 0; i+count <= N && table[i+count] == true; count++);
				maximum = Math.max(maximum, count);

				Q.add(new Info(i,i+count-1,count));
				i += count;
			}

			if(!zero_FLG){
				ans.append(Integer.toString(maximum)).append("\n");
				continue;
			}

			maximum += 1;

			Info info = Q.poll();

			while(!Q.isEmpty()){

				if(info.right+2 == Q.peek().left){

					maximum = Math.max(maximum, info.length+Q.peek().length+1);
				}

				info = Q.poll();
			}

			ans.append(Integer.toString(maximum)).append("\n");
		}
		System.out.printf(ans.toString());
	}
}

class Info{

	Info(int arg_left,int arg_right,int arg_length){
		left = arg_left;
		right = arg_right;
		length = arg_length;
	}
	public int left;
	public int right;
	public int length;
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
