import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
    
public class Main {
    public static void main(String[] args) throws IOException {
        Main instance = new Main();
        instance.execute();
    }
        
    private void execute() throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
            
        while(true) {
            int rows = Integer.parseInt(sc.readLine());
            if(rows == 0){break;}
            Point[] points = toPointArray(sc, rows);
            System.out.println(sampling(points,
            		                    new Point(0.5, 0.5),
            		                    new Point(9.5, 9.5),
            		                    1,
            		                    2));
        }
    }
    
    private int sampling(Point[] points, Point start, Point end, double distance, int cnt) {
    	int max = 0;
    	int count;
    	List<Point> maxPoints = new ArrayList<Point>();
    	for(double x = start.x ; x <= end.x ; x += distance) {
        	for(double y = start.y ; y <= end.y ; y += distance) {
        		count = countOver(points, x, y);
        		if(count > max) {
        			max = count;
        			maxPoints.clear();
        		}
        		if(count == max) {
        			maxPoints.add(new Point(x, y));
        		}
        	}
    	}
    	
    	if(cnt > 1) {
    		for(Point maxPoint : maxPoints) {
    			max = Math.max(max, 
				    			sampling(points,
				    					new Point(maxPoint.x - distance/2, maxPoint.y - distance/2),
				    					new Point(maxPoint.x + distance/2, maxPoint.y + distance/2),
				    					distance / 10,
				    					cnt - 1));
    		}
    	}
    	
    	return max;
    }
    
    private int countOver(Point[] points, double x, double y) {
    	int count = 0;
    	for(Point p : points) {
    		if(p.isOver(x, y)){count++;}
    	}
    	return count;
    }
    
    /**
     * BufferReaderから取得した座標情報を2次元配列に変換する
     */
    private Point[] toPointArray(BufferedReader sc, int rows) throws IOException {
    	Point[] dataArray = new Point[rows];
            
        String[] line;
        for(int i = 0 ; i < rows ; i++) {
            line = sc.readLine().split(",");
            dataArray[i] = new Point(Double.parseDouble(line[0]), Double.parseDouble(line[1]));
        }
        return dataArray;
    }
    
    private class Point {
    	double x, y;
    	Point(double x, double y) {
    		this.x = x;
    		this.y = y;
    	}
    	
    	boolean isOver(Point p) {
    		return this.isOver(p.x, p.y);
    	}
    	
    	boolean isOver(double x, double y) {
    		return Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2) <= 4;
    	}
    }
}