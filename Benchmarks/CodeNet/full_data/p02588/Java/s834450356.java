import java.math.BigDecimal;
import java.util.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<BigDecimal> list = new ArrayList<BigDecimal>();
        for(int i = 0; i < N; i++) {
            BigDecimal t = sc.nextBigDecimal();
            list.add(t);
        }
        
        int ans = 0;
        for(int i = 0; i < list.size(); i++) {
            for(int j = i + 1; j < list.size(); j++) {
                BigDecimal t1 = list.get(i);
                BigDecimal t2 = list.get(j);
                // 掛け算
                BigDecimal t3 = t1.multiply(t2);
                // double型とlong型にキャストして差分を計算
                long t4 = t3.longValue();
                double t5 = t3.doubleValue();
                if (Math.abs(t5 - t4) < 1e-12) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
		sc.close();
	}
}
