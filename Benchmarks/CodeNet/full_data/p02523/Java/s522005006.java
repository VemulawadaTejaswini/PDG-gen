import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

class Main {
	public static void main (String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] pos = in.readLine().split(" ");
        double dx, dy, distance;
        
        dx = Double.parseDouble(pos[0]) - Double.parseDouble(pos[2]);
        dy = Double.parseDouble(pos[1]) - Double.parseDouble(pos[3]);
        distance = Math.sqrt(dx*dx + dy*dy);
        
        System.out.printf("%.5f\n", distance);
	}
}