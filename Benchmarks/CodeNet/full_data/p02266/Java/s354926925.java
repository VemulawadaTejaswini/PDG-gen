import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args) throws IOException{
		
		/*
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();

		int[] heights = null;
		String str = "";

		str = br.readLine();
		heights = new int[str.length() + 1];
		heights[0] = 0;

		int height = 0;
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			switch(c){
				case '\\' :
					height--;
					break;
				case '/' :
					height++;
					break;
			}
			heights[i+1] = height;
		}
		int no = 0;
		int limit = str.length()+1;
		for(int i = 0; i < limit; i++){
			int tmin = heights[i];
			for(int j = i+1; j < limit; j++){
				if(heights[i] < heights[j]) break;
				if(heights[i] == heights[j]){
					if(tmin == heights[i]) break;
					else{
						list.add(i);
						list.add(j);
						no++;
						i = j-1;
						break;
					}
				}
				if(tmin > heights[j]) tmin = heights[j];
			}
		}

		double[] areas = new double[no];
		for(int i = 0; i < areas.length; i++){
			int start = list.get(i * 2);
			int end = list.get(i * 2 + 1);

			height = 0;
			double area = .0;
			for(int j = start; j < end; j++){
				char c = str.charAt(j);
				
				area = area + height;
				switch(c){
					case '\\' :
						height++;
						area += 0.5;
						break;
					case '/' :
						height--;
						area += 0.5;
						break;
				}
			}
			areas[i] = area;
		}

		int sum = 0;
		for(int i = 0; i < areas.length; i++){
			sum += (int) areas[i];
		}
		System.out.printf("%d\n", sum);
		System.out.printf("%d", no);
		for(int i = 0; i < areas.length; i++){
			System.out.printf(" %d", (int) areas[i]);
		}
		System.out.printf("\n");
	}
}