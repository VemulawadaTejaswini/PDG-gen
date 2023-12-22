import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	static ArrayList<Point2D.Double> points = new ArrayList<Point2D.Double>(); 
	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Point2D.Double p1 = new Point2D.Double(0, 0);
		Point2D.Double p2 = new Point2D.Double(100, 0);
		points.add(p1);
		koch(n, p1, p2);
		points.add(p2);
		
		for(int i = 0; i < points.size(); i++){
			System.out.printf("%.8f %.8f\n", points.get(i).x, points.get(i).y);
		}
	}
	
	static void koch(int n, Point2D.Double p1, Point2D.Double p2){
		if(n <= 0){
			return;
		}
		
		//points.add(p1);
		
		Point2D.Double p3 = new Point2D.Double((p2.x + p1.x*2)/3, (p2.y + p1.y*2)/3);
		
		
		Point2D.Double p5 = new Point2D.Double((p2.x*2 + p1.x)/3, (p2.y*2 + p1.y)/3);
		Double dx = p5.x - p3.x;
		Double dy = p5.y - p3.y;
		///System.out.println(Math.cos(Math.PI/3));
		Point2D.Double p4 = new Point2D.Double(p3.x + dx*Math.cos(Math.PI/3)-dy*Math.sin(Math.PI/3),
				p3.y + dx*Math.sin(Math.PI/3)+dy*Math.cos(Math.PI/3));
		koch(n - 1, p1, p3);
		points.add(p3);
		koch(n - 1, p3, p4);
		points.add(p4);
		koch(n - 1, p4, p5);
		points.add(p5);
		koch(n - 1, p5, p2);
		//points.add(p2);
	}

}