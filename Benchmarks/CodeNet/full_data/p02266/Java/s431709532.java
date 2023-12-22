import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> sg = new ArrayList<Integer>();
		
		int[] heights = null;
		String str = "";
		try {
			str = in.readLine();
			heights = new int[str.length() + 1];
			heights[0] = 0;
			
			int height = 0;
			for (int i = 1; i < (str.length() + 1); i++) {
				char c = str.charAt(i - 1);
				
				switch (c) {
				case '\\' :
					height--;
					break;
				case '/' :
					height++;
					break;
				}
				heights[i] = height;
			}

			int num = 0;
			
			int limit = str.length() + 1;
			for (int i = 0; i < limit; i++) {
				int th = heights[i];
				int tmin = th;
				
				for (int j = (i + 1); j < limit; j++) {
					if (th < heights[j]) break;
					
					if (th == heights[j]) {
						if (tmin == th) {
							break;
						} else {
							sg.add(i);
							sg.add(j);
							
							num++;
							i = (j - 1);
							break;
						}
					}
					
					if (tmin > heights[j]) tmin = heights[j];
				}
			}
			
			double[] areas = new double[num];
			for (int i = 0; i < areas.length; i++) {
				int start = sg.get(i * 2);
				int end = sg.get(i * 2 + 1);
				
				height = 0;
				double area = 0.0;
				for (int j = start; j < end; j++) {
					char c = str.charAt(j);
					
					area = area + height;
					switch (c) {
					case '\\' :
						height++;
						area = area + 0.5;
						break;
					case '/' :
						height--;
						area = area - 0.5;
						break;
						}
				}
				
				areas[i] = area;
			}
			
			int sum = 0;
			for (int i = 0; i < areas.length; i++) {
				sum = sum + (int)areas[i];
			}
			System.out.println(sum);
			
			System.out.print(num);
			for (int i = 0; i < num; i++) {
				System.out.print(" " + (int)areas[i]);
			}
			System.out.println();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}