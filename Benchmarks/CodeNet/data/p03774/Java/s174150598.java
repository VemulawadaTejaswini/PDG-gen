import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int c = in.nextInt(); in.nextLine();
		
		int[] studentsX = new int[s];
		int[] studentsY = new int[s];
		int[] checkpointsX = new int[c];
		int[] checkpointsY = new int[c];
		
		for ( int i = 0; i < s; i++ ) {
			studentsX[i] = in.nextInt();
			studentsY[i] = in.nextInt();
			in.nextLine();
		}
		
		for ( int i = 0; i < c; i++ ) {
			checkpointsX[i] = in.nextInt();
			checkpointsY[i] = in.nextInt();
		}
		
		// System.out.println(Arrays.toString(studentsX));
		// System.out.println(Arrays.toString(studentsY));
		// System.out.println(Arrays.toString(checkpointsX));
		// System.out.println(Arrays.toString(checkpointsY));
		
		int minim = 100000000;
		int dist = -1;
		int minimPoint = 50;
		for ( int i = 0; i < s; i++ ) {
			for ( int j = 0; j < c; j++ ) {
				dist = Math.abs(studentsX[i]-checkpointsX[j])+Math.abs(studentsY[i]-checkpointsY[j]);
				if ( dist == minim ) {
					minimPoint = Math.min(minimPoint, j+1);
				} else if ( dist < minim ) {
					minim = Math.min(minim, dist);
					minimPoint = j+1;
				}
				// System.out.println("dist: "+dist);
				// System.out.println("minimpt: "+minimPoint);
			}
			System.out.println(minimPoint);
			minim = 100000000;
			dist = -1;
			minimPoint = 50;
		}
	}
}