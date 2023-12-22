import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	int[][] map;
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine() == true) {
			int lines = Integer.parseInt(sc.nextLine());
			if (lines == 0) break;
			
			BigDecimal[][] points = new BigDecimal[lines][2];
			for (int i = 0; i < lines; i++) {
				String[] nico = sc.nextLine().split(",");
				
				for (int j = 0; j < nico.length; j++) {
					points[i][j] = new BigDecimal(nico[j]);
				}
			}
			
			boolean[] flag = new boolean[points.length];
			for (int i = 0; i < flag.length; i++) {
				flag[i] = true;
			}
			
			for (int i = 0; i < points.length; i++) {
				for (int j = (i + 1); j < points.length; j++) {
					BigDecimal dx = points[j][0].subtract(points[i][0]);
					BigDecimal dy = points[j][1].subtract(points[i][1]);
					
					boolean judge = true;
					if (dx.compareTo(BigDecimal.valueOf(0.0)) != 0) {
						BigDecimal a = dy.divide(dx, BigDecimal.ROUND_HALF_UP);
						BigDecimal b = points[i][1].subtract(a.multiply(points[i][0]));

						BigDecimal side = BigDecimal.valueOf(0.0);
						for (int k = 0; k < points.length; k++) {
							BigDecimal nside = BigDecimal.valueOf(0.0);
							
							if ((k != i) && (k != j)) {
								nside = points[k][1].subtract(a.multiply(points[k][0]).add(b));
							}
							
							if ((side.compareTo(BigDecimal.valueOf(0.0)) != 0) && (side.multiply(nside).compareTo(BigDecimal.valueOf(0.0)) < 0)) {
								judge = false;
								break;
							}
							side = nside;
						}
					} else {
						BigDecimal side = BigDecimal.valueOf(0.0);
						for (int k = 0; k < points.length; k++) {
							BigDecimal nside = BigDecimal.valueOf(0.0);
							
							if ((k != i) && (k != j)) {
								nside = points[k][0].subtract(points[i][0]);
							}

							if ((side.compareTo(BigDecimal.valueOf(0.0)) != 0) && (side.multiply(nside).compareTo(BigDecimal.valueOf(0.0)) < 0)) {
								judge = false;
								break;
							}
							
							side = nside;
						}
					}
					
					if (judge == true) {
						flag[i] = false;
						flag[j] = false;
					}
				}
			}
			
			int cnt = 0;
			for (int i = 0; i < flag.length; i++) {
				if (flag[i] == true) cnt++;
			}
			
			System.out.println(cnt);
		}
	}
}