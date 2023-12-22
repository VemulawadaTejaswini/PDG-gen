import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	
	// ３辺から面積を算出
	public static double HerosFormula (double a, double b, double c) {
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
		
	}
	
	// ２点間の距離算出
	public static double getDistance (double a, double b, double c, double d) {
		return Math.sqrt(Math.pow(c -a,2) + Math.pow(d - b,2));
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> ans = new ArrayList<String>();

		while (true) {
			String s = br.readLine();
			if (s == null) break;
			StringTokenizer st = new StringTokenizer(s," ");
			
			double x1 = Double.parseDouble(st.nextToken());
			double y1 = Double.parseDouble(st.nextToken());
			double x2 = Double.parseDouble(st.nextToken());
			double y2 = Double.parseDouble(st.nextToken());
			double x3 = Double.parseDouble(st.nextToken());
			double y3 = Double.parseDouble(st.nextToken());
			double xp = Double.parseDouble(st.nextToken());
			double yp = Double.parseDouble(st.nextToken());
			
			double dis_x1tox2 = getDistance(x1,y1,x2,y2);
			double dis_x1tox3 = getDistance(x1,y1,x3,y3);
			double dis_x2tox3 = getDistance(x2,y2,x3,y3);
			double dis_xptox1 = getDistance(xp,yp,x1,y1);
			double dis_xptox2 = getDistance(xp,yp,x2,y2);
			double dis_xptox3 = getDistance(xp,yp,x3,y3);
			
			double area1 = HerosFormula(dis_xptox1,dis_xptox2,dis_x1tox2);
			double area2 = HerosFormula(dis_xptox2,dis_xptox3,dis_x2tox3);
			double area3 = HerosFormula(dis_xptox1,dis_xptox3,dis_x1tox3);
			double area4 = HerosFormula(dis_x1tox2,dis_x1tox3,dis_x2tox3);
			
			double sum = area1 + area2 + area3;
			
			sum = BigDecimal.valueOf(sum).setScale(10, BigDecimal.ROUND_HALF_UP).doubleValue();
			area4 = BigDecimal.valueOf(area4).setScale(10, BigDecimal.ROUND_HALF_UP).doubleValue();
			
			if (sum == area4)
				ans.add("YES");
			else
				ans.add("NO");
			
		}
		for (String s : ans)
			System.out.println(s);
	}

}