import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double x=0.0;
		double y=0.0;
		double sumangle = 0.0;
		String[] str = new String[2];
		while(true){
			str = br.readLine().split(",");
			int walk = Integer.parseInt(str[0]);
			int angle = Integer.parseInt(str[1]);
			if(walk == 0 && angle == 0){
				System.out.println((int)x);
				System.out.println((int)y);
				break;
			}
			y += (double)walk*Math.cos(Math.toRadians(sumangle));
			x += (double)walk*Math.sin(Math.toRadians(sumangle));
			sumangle += (double)angle;
		}
	}

}