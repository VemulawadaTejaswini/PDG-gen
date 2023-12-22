import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Problem1202_MobilePhoneCoverage_Brute {
public class Main {
	private Maxnorm maxnorm;
	
	public static void main(String[] args) {
		try {
		//	Problem1202_MobilePhoneCoverage_Brute test = new Problem1202_MobilePhoneCoverage_Brute();
			Main test = new Main();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			int count = 0;
			String line;
			while((line = reader.readLine()) != null) {
				int antennaNumber = Integer.parseInt(line);
				count++;
				if(antennaNumber < 1) {
					break;
				} else {
					test.createNorm();
					for(int i = 0; i < antennaNumber; i++) {
						test.addAntenna(reader.readLine());
					}
					double area = test.getArea();
					System.out.printf("%d %.2f\n", count,area);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	void createNorm() {
		maxnorm = new Maxnorm();
	}
	void addAntenna(String line) {
		String[] textArray = line.split(" ");
		
		int x = (int)(Double.parseDouble(textArray[0]) * 10);
		int y = (int)(Double.parseDouble(textArray[1]) * 10);
		int r = (int)(Double.parseDouble(textArray[2]) * 10);
		
		maxnorm.addAntenna(x, y, r);
	}
	double getArea() {
		int area = maxnorm.getArea();
		double result = (double)area / 100;
		
		return result;
	}
	//MaxnormNXÅÍSÄÌx/yÀWð10{, ÊÏð100{µ½lÅ\í·Bi®Å\í·Æ¢¤±Æ)
	private class Maxnorm {
		boolean[][] area;	//area[210][220] = (x,y) ; (10,20)
		final int MAX_X = 6000;
		final int MAX_Y = 6000;
		
		Maxnorm() {
			area = new boolean[MAX_X][MAX_X];	//0 <= x+r <= 400, -200 <= x-r <= 200Byà¯l
		}
		void addAntenna(int x, int y, int r) {
			for(int i = x - r +2000; i < x + r + 2000; i++) {
				for(int j = y - r + 2000; j < y + r + 2000; j++) {
					area[i][j] = true;
				}
			}
		}
		int getArea() {
			int result = 0;
			for(int i = 0; i < MAX_X; i++) {
				for(int j = 0; j < MAX_Y; j++) {
					if(area[i][j]) {
						result++;
					}
				}
			}
			return result;
		}
	}
}