import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()) {
			Vector2D[] list = new Vector2D[4];
			for(int i = 0; i < 4; i++) {
				list[i] = new Vector2D(stdIn.nextDouble(),stdIn.nextDouble());
			}
			if(hittest_point_polygon_2d(list[0],list[1],list[2],list[3])) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
	
	static class Vector2D {
		Vector2D(double x, double y) {
			this.x = x;
			this.y = y;
		}
		double x;
		double y;
	}
	
	static Vector2D sub_vector(Vector2D a, Vector2D b) {
		Vector2D ret = new Vector2D(0,0);
		ret.x = a.x - b.x;
		ret.y = a.y - b.y;
		return ret;
	}
	
	static boolean hittest_point_polygon_2d(Vector2D a, Vector2D b, Vector2D c, Vector2D p) {
		Vector2D ab = sub_vector(b,a);
		Vector2D bp = sub_vector(p,b);
		
		Vector2D bc = sub_vector(c,b);
		Vector2D cp = sub_vector(p,c);
		
		Vector2D ca = sub_vector(a,c);
		Vector2D ap = sub_vector(p,a);
		
		double c1 = ab.x * bp.y - ab.y * bp.x;
		double c2 = bc.x * cp.y - bc.y * cp.x;
		double c3 = ca.x * ap.y - ca.y * ap.x;
		if( ( c1 > 0 && c2 > 0 && c3 > 0 ) || ( c1 < 0 && c2 < 0 && c3 < 0 ) ) {
		        //三角形の内側に点がある
		        return true;
		}
		return false;
		
	}
	
}