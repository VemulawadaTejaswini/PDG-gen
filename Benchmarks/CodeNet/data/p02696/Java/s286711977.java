import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = Integer.parseInt(sc.next());
		long b = Long.parseLong(sc.next());
		long n = Long.parseLong(sc.next());
		long max = 0;
		long result = 0;

		for(long x=1; x<=n; x++){
			if(x%b==(b-1)){
				result = (a * x /b) - a * ((int) (x / b));
				if(result > max){
					max = result;
				}
            }
		}

		System.out.println(max);
	}
}