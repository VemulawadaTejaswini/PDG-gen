
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		String[] map;
		while(true){
			if((map = createMap()) == null)	break;
			System.out.println(getMaxArea(map));
		}
	}
	
	private static String[] createMap(){
		String[] map;
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = sc.nextInt();
		if(height == 0 && width == 0){
			return null;
		}
		map = new String[height];
		for(int h = 0; h < map.length; h++){
			map[h] = sc.next();
		}
		return map;
	}
	
	public static int getMaxArea(String[] map){
		int maxArea = 0;
		for(int h = 0; h < map.length; h++){
			for(int w = 0; w < map[0].length(); w++){
				maxArea = Math.max(maxArea, getMaxArea(map, h, w));
			}
		}
		return maxArea;
	}
	
	private static int getMaxArea(String[] map, int source_height, int source_width){
		int maxArea = 0;
		for(int h = 1; source_height + h - 1< map.length; h++){
			for(int w = 1; source_width + w - 1< map[0].length(); w++){
				if(checkRectangular(map, source_height, source_width, h, w)){
					maxArea = Math.max(maxArea, h * w);
				}
			}
		}
		return maxArea;
	}
	
	/**
	 * 対象の始点から指定したサイズの矩形が存在するか
	 */
	private static boolean checkRectangular(String[] map, int source_height, int source_width, int height, int width){
		for(int h = 0; source_height + h < map.length && h < height; h++){
			String line = map[source_height + h].substring(source_width, source_width + width);
			if(map[0].length() <= source_width + width - 1 ||
				line.contains("*"))	return false;
		}
		return true;
	}
}