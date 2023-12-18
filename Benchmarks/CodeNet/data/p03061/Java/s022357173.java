import java.time.Instant;
import java.util.*;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args){

		Long ans = 0l;
		Scanner sc = new Scanner(System.in);
		Long N = sc.nextLong();
		List<Long> aList = new ArrayList<>();

		for(Long i=0l; i<N; i++){
			aList.add(sc.nextLong());
		}

		if(aList.size()==2){
			System.out.println(Math.max(aList.get(0), aList.get(1)));
			return;

		}

		for(Long i=0l; i<N; i++){
			Long tmp = aList.get(0);
			aList.remove(0);
			ans = Math.max(ans, gcd(aList.toArray(new Long[aList.size()])));
			aList.add(tmp);
		}

		System.out.println(ans);
	}

	public static final Long gcd(final Long... param) {
	    final int len = param.length;
	    Long g = gcd(param[0], param[1]);
	    for (int i = 1; i < len - 1; i++) {
	        g = gcd(g, param[i + 1]);
	    }
	    return g;
	}

	public static final long gcd(Long a, Long b) {
	    //a > b にする（スワップ）
	    if (a < b) {
	        Long tmp = a;
	        a = b;
	        b = tmp;
	    }

	    //ユークリッドの互除法
	    Long r = -1l;
	    while (r != 0) {
	        r = a % b;
	        a = b;
	        b = r;
	    }

	    return a;    //b には r=0 の値が入るため、a を返す
	}
}
