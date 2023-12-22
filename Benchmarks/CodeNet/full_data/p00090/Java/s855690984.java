import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	private Scanner sc;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			int lines = Integer.parseInt(sc.nextLine());
			if (lines == 0) break;

			BigDecimal[] x = new BigDecimal[lines];
			BigDecimal[] y = new BigDecimal[lines];
			for (int i = 0; i < lines; i++) {
				String[] nico = sc.nextLine().split(",");
				x[i] = new BigDecimal(nico[0]);
				y[i] = new BigDecimal(nico[1]);
			}
			
			int max = 1;
			for (int i = 0; i < lines; i++) {
				for (int j = (i + 1); j < lines; j++) {
					BigDecimal d = calc(x[i], x[j], y[i], y[j]);
					if (d.compareTo(BigDecimal.valueOf(4.0)) > 0.0) continue;
					
					BigDecimal[] px = new BigDecimal[1];
					BigDecimal[] py = new BigDecimal[1];
					
					if ((x[i] == x[j]) && (y[i] == y[j])) {
						px[0] = x[i];
						py[0] = y[i];
					} else {
						BigDecimal cr = BigDecimal.valueOf(Math.atan2(-y[j].subtract(y[i]).doubleValue(), x[j].subtract(x[i]).doubleValue()));
						BigDecimal dr = BigDecimal.valueOf(Math.atan2(
								Math.sqrt(BigDecimal.valueOf(1.0).subtract(d.divide(BigDecimal.valueOf(2.0 * 2.0))).doubleValue()),
								(Math.sqrt(d.doubleValue()) / 2.0)));
						
						px = new BigDecimal[2];
						py = new BigDecimal[2];

						px[0] = x[i].add(BigDecimal.valueOf(Math.cos(cr.subtract(dr).doubleValue())));
						py[0] = y[i].subtract(BigDecimal.valueOf(Math.sin(cr.subtract(dr).doubleValue())));
						
						px[1] = x[i].add(BigDecimal.valueOf(Math.cos(cr.add(dr).doubleValue())));
						py[1] = y[i].subtract(BigDecimal.valueOf(Math.sin(cr.add(dr).doubleValue())));
					}
					
					for (int p = 0; p < px.length; p++) {
						System.out.println(px[p] + " : " + py[p]);
						int tmp = 0;
						for (int k = 0; k < lines; k++) {
							if (calc(px[p], x[k], py[p], y[k]).compareTo(BigDecimal.valueOf(1.0)) <= 0) tmp++;
						}
						
						if (max < tmp) max = tmp;
					}
				}
			}
			System.out.println(max);
		}
	}
	
	public BigDecimal calc(BigDecimal x0, BigDecimal x1, BigDecimal y0, BigDecimal y1) {
		return x0.subtract(x1).multiply(x0.subtract(x1)).add(y0.subtract(y1).multiply(y0.subtract(y1)));
	}
}