import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		
		Plot start = new Plot(0, 0);
		Plot end = new Plot(100, 0);
		
		List<Plot> plots = new ArrayList<>();
		plots.add(start);
		plots.add(end);
		List<Plot> result = solve(start, end, n);
		result.add(end);
		result.forEach(p -> {
			System.out.println(p.x + " " + p.y);
		});
	}
	
	static List<Plot> solve(Plot start, Plot end, int depth){
		if(depth == 0){
			return Arrays.asList(start);
		}
		
		double deltaX = end.x - start.x;
		double deltaY = end.y - start.y;
		
		Plot s = new Plot(start.x + deltaX / 3.0, start.y + deltaY / 3.0);
		Plot t = new Plot(start.x + deltaX * 2.0 / 3.0, start.y + deltaY * 2.0 / 3.0);
		Plot u = new Plot(0, 0);
		double rad = Math.PI / 3.0;
		u.x = deltaX / 3.0 * Math.cos(rad) - deltaY / 3.0 * Math.sin(rad) + start.x;
		u.y = deltaX / 3.0 * Math.sin(rad) + deltaY / 3.0 * Math.cos(rad) + start.y;

		List<Plot> plots = Arrays.asList(start, s, u, t, end);
		List<Plot> result = new ArrayList<>();
		
		for(int i = 0; i < plots.size() - 1; i++){
			result.addAll(solve(plots.get(i), plots.get(i + 1), depth - 1));
		}
				
		return result;
	}
	
	static class Plot{
		double x = 0.0;
		double y = 0.0;
		public Plot(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
	}
}
