import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			Vector2D A = new Vector2D(sc.nextInt(),sc.nextInt());
			Vector2D B = new Vector2D(sc.nextInt(),sc.nextInt());
			Vector2D C = new Vector2D(sc.nextInt(),sc.nextInt());
			Vector2D K = new Vector2D(sc.nextInt(),sc.nextInt());
			Vector2D S = new Vector2D(sc.nextInt(),sc.nextInt());
			boolean KB = hittestPointPolygon2D(A, B, C, K);
			boolean SB = hittestPointPolygon2D(A, B, C, S);
			boolean ans = false;
			if(KB && SB) {
				ans = false;
			}
			else if(KB || SB) {
				ans = true;
			}
			
			System.out.println((ans)?"OK":"NG");
		}
	}
	
	static class Vector2D {
		int x;
		int y;
		Vector2D(int a, int b) {
			x = a;
			y = b;
		}
		Vector2D() {
			x = 0;
			y = 0;
		}
	}
	
	static Vector2D sub_vector(Vector2D a, Vector2D b) {
		Vector2D ret = new Vector2D();
		ret.x = a.x - b.x;
		ret.y = a.y - b.y;
		return ret;
	}
	
	static boolean hittestPointPolygon2D(Vector2D A, Vector2D B, Vector2D C, Vector2D P) {
		Vector2D AB = sub_vector(B, A);
	    Vector2D BP = sub_vector(P, B);

	    Vector2D BC = sub_vector(C, B);
	    Vector2D CP = sub_vector(P, C);

	    Vector2D CA = sub_vector(A, C);
	    Vector2D AP = sub_vector(P, A);

	    int c1 = AB.x * BP.y - AB.y * BP.x;
	    int c2 = BC.x * CP.y - BC.y * CP.x;
	    int c3 = CA.x * AP.y - CA.y * AP.x;

	    if( ( c1 > 0 && c2 > 0 && c3 > 0 ) || ( c1 < 0 && c2 < 0 && c3 < 0 ) ) {
	        return true;
	    }

	    return false;
	}
	
	
	

}