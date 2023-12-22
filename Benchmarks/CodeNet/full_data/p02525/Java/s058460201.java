import java.io.*;
import java.util.*;
class Main {
	
	public static double calc(ArrayList<Integer> data) {
		
		double a = 0;
		int n = data.size();
		double m = 0;
		
		// 平均の算出
		for (int d : data)
			m += d;
		m /= data.size();
		
		for (int d : data)
			a += Math.pow((d - m),2) / n;
		
		return Math.sqrt(a);
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		int n;
		ArrayList<Integer> data = new ArrayList<Integer>();
		ArrayList<Double> ans = new ArrayList<Double>();
		
		while(true) {
			n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			while(st.hasMoreTokens())
				data.add(Integer.parseInt(st.nextToken()));
			
			ans.add(calc(data));
			data.clear();
		}
		for (double a : ans)
			System.out.printf("%.8f\n",a);
	}
	
}