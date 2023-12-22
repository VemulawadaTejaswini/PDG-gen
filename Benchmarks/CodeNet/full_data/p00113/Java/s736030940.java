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

		int surplus[] = new int[1000005]; //余り
		int table[] = new int[85]; //商

		int p,q;
		int tmp,tmp_surplus,cycle_start = 0,tail = 0;

		boolean is_cycle;

		StringBuilder ans = new StringBuilder();

		while(scanner.hasNext()){
			p = scanner.nextInt();
			q = scanner.nextInt();

			for(int i = 0; i < q; i++){

				surplus[i] = -1;
			}

			surplus[p] = 0; //pが再登場しても循環

			tmp = p*10;
			is_cycle = false;

			for(int digit = 1; digit <= 80; digit++){

				tmp_surplus = tmp%q;
				table[digit] = tmp/q;

				if(tmp_surplus == 0){ //割り切れた
					tail = digit;
					break;
				}
				if(surplus[tmp_surplus] != -1){ //循環
					//System.out.printf("循環 桁%d 商%d 余り%d\n", digit,table[digit],tmp_surplus);
					is_cycle = true;
					cycle_start = surplus[tmp_surplus]+1;
					tail = digit;
					break;
				}
				surplus[tmp_surplus] = digit;
				tmp = 10*tmp_surplus;
			}

			if(is_cycle){

				for(int i = 1; i <= tail ; i++){

					ans.append(Integer.toString(table[i]));
				}
				ans.append("\n");
				for(int i = 1; i <= cycle_start-1; i++){

					ans.append(" ");
				}
				for(int i = cycle_start; i <= tail; i++){

					ans.append("^");
				}
				ans.append("\n");

			}else{

				for(int i = 1; i <= tail; i++){

					ans.append(Integer.toString(table[i]));
				}
				ans.append("\n");
			}
		}
		System.out.print(ans.toString());
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
