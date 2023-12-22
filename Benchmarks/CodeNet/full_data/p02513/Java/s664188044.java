import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			double maxDist = Double.parseDouble(br.readLine());
			if(maxDist == 0) break;
			
			String str = br.readLine();
			int prevPos = -1;
			int sPos = str.indexOf(" ");
			
			double px = Double.parseDouble(str.substring(prevPos+1, sPos));
			prevPos = sPos;
			sPos = str.indexOf(" ", sPos+1);
			
			double py = Double.parseDouble(str.substring(prevPos+1, sPos));
			prevPos = sPos;
			sPos = str.indexOf(" ", sPos+1);
			
			double vx = Double.parseDouble(str.substring(prevPos+1, sPos));
			prevPos = sPos;
			
			double vy = Double.parseDouble(str.substring(prevPos+1));
			
			if(Math.abs(py/px) > Math.abs(vy/vx) + 0.0000001 || Math.abs(py/px) < Math.abs(vy/vx) - 0.0000001) {
				System.out.println("impossible"); continue;
			}
			
			double dist = Math.sqrt(py*py + px*px);
			
			if(Math.signum(py/px) != Math.signum(vy/vx))
				dist += 2 - dist*2;
			
			System.out.println(dist);
		}
	}
}