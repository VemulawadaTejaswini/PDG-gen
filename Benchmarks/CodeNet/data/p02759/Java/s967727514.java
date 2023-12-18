import java.math.BigDecimal;
import java.math.RoundingMode;
class Num {
	public static void main(String[] args) {
      	int N , P;
		Scanner N = new Scanner();
		
		P = N / 2;
		P = P.setScale(0, RoundingMode.HALF_UP);
		System.out.println(P.toPlainString()); //12
	}
}