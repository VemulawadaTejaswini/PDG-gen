import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        List<Double> kazu = new ArrayList<>();
        long ans = 1;
        long max = 1000000000000000001l;
        for(double i = 0;i < N;i++){
            long temp = sc.nextLong();;
            ans *= temp;
            
        }
        BigDecimal ans1 = new BigDecimal(String.valueOf(ans));
        BigDecimal max1 = new BigDecimal(String.valueOf(max));
		BigDecimal ans2 = ans1.setScale(0, RoundingMode.DOWN);
		BigDecimal max2 = max1.setScale(0, RoundingMode.DOWN);
		//System.out.println(ans2);
		//System.out.println(max2);
		int res = ans2.compareTo(max2);
        if(res == -1){
            System.out.println(ans2);
        }else{
            System.out.println(-1);
        }
    }
}
