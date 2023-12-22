import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			ArrayList<Double> a = new ArrayList<Double>();
			ArrayList<Integer> n = new ArrayList<Integer>();
			while ((buf = br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(buf,",");
				n.add(Integer.parseInt(st.nextToken()));
				a.add(BMI(Double.parseDouble(st.nextToken()),Double.parseDouble(st.nextToken())));
			}
			for (int i=0;i<a.size();i++) {
				if (a.get(i)>=25.0) System.out.println(n.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static double BMI(double w,double h) {
		return w/Math.pow(h,2);
	}
}