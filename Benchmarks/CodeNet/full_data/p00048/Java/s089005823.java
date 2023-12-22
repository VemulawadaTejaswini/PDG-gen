import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				double d = Double.parseDouble(buf);
				if (d<=48.00) System.out.println("light fly");
				else if (d<=51.00) System.out.println("fly");
				else if (d<=54.00) System.out.println("bantam");
				else if (d<=57.00) System.out.println("feather");
				else if (d<=60.00) System.out.println("light");
				else if (d<=64.00) System.out.println("light welter");
				else if (d<=69.00) System.out.println("welter");
				else if (d<=75.00) System.out.println("light middle");
				else if (d<=81.00) System.out.println("middle");
				else if (d<=91.00) System.out.println("light heavy");
				else System.out.println("heavy");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}