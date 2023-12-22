import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++){
			String tmp = br.readLine();
			
			if(tmp == null){
				break;
			}
			String[] tmpArray = tmp.split(" ");
			
			Point2D[] points = new Point2D[4];
			for(int j = 0; j < points.length ;j++){
				points[j] = new Point2D.Double(Double.parseDouble(tmpArray[j*2]), Double.parseDouble(tmpArray[j*2+1]));
			}
			Line2D line1 = new Line2D.Double(points[0], points[1]);
			
			if(line1.ptLineDist(points[2]) == line1.ptLineDist(points[3])){
				System.out.println("YES");
			}
			/*
			//????????????????????§????????§??????????????£??????NO
			if((points[0].equals(points[1]) || points[2].equals(points[3]))){
				System.out.println("NO");
			}
			//???????????????????????????????°???????
			else if((points[1].getY() - points[0].getY())*(points[3].getX() - points[2].getX()) == (points[3].getY() - points[2].getY())*(points[1].getX() - points[0].getX())){
				System.out.println("YES");
			}
			*/
			else{
				System.out.println("NO");
			}
		}
	}

}