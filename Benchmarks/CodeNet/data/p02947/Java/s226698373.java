import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] lines = new String[num];
		for(int i = 0; i < num; i++){
			String str = sc.next();
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			lines[i] = new String(chars);
		}
		Arrays.sort(lines);

		BigDecimal ans = BigDecimal.ZERO;
		String prev = "";
		int cnt = 0;
		for(String str : lines){
			if(str.equals(prev)){
				cnt++;
			}else if(cnt > 0){
				ans = ans.add(Combination.combination(cnt+1, 2));
				cnt = 0;
			}
			prev = str;
		}
		if(cnt > 0){
			ans = ans.add(Combination.combination(cnt+1, 2));
		}

		System.out.println(new DecimalFormat("0").format(ans));

	}
}

class Combination{
    public static BigDecimal factorial(int n) {
        BigDecimal ans = BigDecimal.ONE;
        for(int i = 1; i <= n; i++)ans = ans.multiply(BigDecimal.valueOf(i));
        return ans;
    }

    public static BigDecimal combination(int n, int k) {
		if(n == 0 || k == 0)return BigDecimal.ONE;
        BigDecimal ans = BigDecimal.ONE;
        ans = ans.multiply(factorial(n));
        ans = ans.divide(factorial(k));
        ans = ans.divide(factorial(n-k));
        return ans;
    }
}