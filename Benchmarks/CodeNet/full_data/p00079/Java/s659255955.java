
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {

	/*
	 * https://onlinejudge.u-aizu.ac.jp/problems/0079
	 */

	public static void main(String[] args) throws IOException {
		//入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<double[]> points = new ArrayList<>();
		String str = br.readLine();
		for(; str!=null; str=br.readLine()) {
			String s[] = str.trim().split(",");
			double p[] = {Double.parseDouble(s[0]), Double.parseDouble(s[1])};
			points.add(p);
		}

		//0番目の点が原点になるように平行移動
		double originX = points.get(0)[0],
		       originY = points.get(0)[1];
		for(int i=0; i<points.size(); i++) {
			double p1[] = points.get(i);
			p1[0] -= originX;
			p1[1] -= originY;
		}
		//外積の半分を計算して足す
		double area = 0;
		for(int i=1; i+1<points.size(); i++) {
			area += crossProduct(points.get(i), points.get(i+1))/2;
			//System.out.println(area);
		}
		//area += crossProduct(points.get(points.size()-1), points.get(1)); <- これは要らない

		//出力
		System.out.println(Math.abs(area));
	}

	//外積を計算
	private static double crossProduct(double[] v1, double[] v2) {
		return v1[0]*v2[1]-v1[1]*v2[0];
	}

}

