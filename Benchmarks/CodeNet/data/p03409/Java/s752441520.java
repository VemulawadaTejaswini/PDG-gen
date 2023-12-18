import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
  /**
   * Main method.
   */
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    
    final int N = s.nextInt(); 
    
    List<Integer> a = new ArrayList<>();
    List<Integer> b = new ArrayList<>();
    List<Double> redDis = new ArrayList<>();	//赤点の原点からの距離の２乗
    List<Integer> c = new ArrayList<>();
    List<Integer> d = new ArrayList<>();
    List<Double> blueDis = new ArrayList<>();	//青点の原点からの距離の２乗
    		
    for (int i = 0; i < N; i++) {
    	int a_i = s.nextInt();
    	int b_i = s.nextInt();
    	a.add(a_i);
    	b.add(b_i);
    	redDis.add(Math.pow(a_i, 2) + Math.pow(b_i, 2));
    }
    
    for (int i = 0; i < N; i++) {
    	int c_i = s.nextInt();
    	int d_i = s.nextInt();
    	c.add(c_i);
    	d.add(d_i);
    	blueDis.add(Math.pow(c_i, 2) + Math.pow(d_i, 2));
    }
    
    int count = 0;
    while (true) {
    	double red_min = 999999;
    	for (double dis : redDis) {
    		red_min = Math.min(red_min, dis);
    	}   	
    	int index = redDis.indexOf(red_min);
    	int red_x = a.get(index);
    	int red_y = b.get(index);
    	
    	double blue_min = 999999;
    	for (double dis : blueDis) {
    		blue_min = Math.min(blue_min, dis);
    	}   	
    	index = blueDis.indexOf(blue_min);
    	int blue_x = c.get(index);
    	int blue_y = d.get(index);
    	
    	if (red_x < blue_x && red_y < blue_y) {
    		count++;
    		a.remove(a.indexOf(red_x));
    		b.remove(b.indexOf(red_y));
    		redDis.remove(redDis.indexOf(red_min));
    		c.remove(c.indexOf(blue_x));
    		d.remove(d.indexOf(blue_y));
    		blueDis.remove(blueDis.indexOf(blue_min));
    	} else {
    		c.remove(c.indexOf(blue_x));
    		d.remove(d.indexOf(blue_y));
    		blueDis.remove(blueDis.indexOf(blue_min));
    	}
    	if (a.isEmpty() || c.isEmpty()) {
    		break;
    	}
    }
    
    System.out.println(count);
 
  }
}
