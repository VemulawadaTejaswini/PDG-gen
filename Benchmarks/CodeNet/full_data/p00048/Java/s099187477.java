import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while(null != (s=in.readLine())){
			System.out.println(getClass(Double.parseDouble(s)));
		}
	}

	private static String getClass(double weight){
		return  (weight<=48.00)?"light fly":
				(weight<=51.00)?"fly":
				(weight<=54.00)?"bantam":
				(weight<=57.00)?"feather":
				(weight<=60.00)?"light":
				(weight<=64.00)?"light welter":
				(weight<=69.00)?"welter":
				(weight<=75.00)?"light middle":
				(weight<=81.00)?"middle":
				(weight<=91.00)?"light heavy":
								"heavy";
	}
}