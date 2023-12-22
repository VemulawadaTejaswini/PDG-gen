import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigDecimal tmp = BigDecimal.ZERO;
		int i, j;
		BigDecimal meu, rinrin;
		ArrayList<BigDecimal> array = new ArrayList<BigDecimal>();
		ArrayList<BigDecimal> fuga = new ArrayList<BigDecimal>();
		for(i = 0;i < n;++i){
			array.add(BigDecimal.valueOf(sc.nextInt()));
		}
		for(i = 0;i < n;++i){
			meu = array.get(i);
			for(j = 0;j < n;++j){
				if(j != i){
					rinrin = array.get(j);
					fuga.clear();
					for(BigDecimal marika:array){
						fuga.add(marika);
					}
					fuga.remove(i);
					fuga.remove((j < i) ? j : j - 1);
					Collections.sort(fuga);
					Collections.reverse(fuga);
					BigDecimal hoga = fuga.get(0).add(fuga.get(1)).divide(meu.subtract(rinrin).abs(), 8, BigDecimal.ROUND_HALF_UP);
					if(tmp.compareTo(hoga) < 0) tmp = hoga;
				}
			}
		}
		
		System.out.println(tmp);
	}
}