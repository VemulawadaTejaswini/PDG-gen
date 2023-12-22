import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;

		double xa, ya, ra, xb, yb, rb;
		try {
			line = br.readLine();
			line.trim();
			int N = Integer.parseInt(line);
			for(int i = 0; i < N; i++){
				line = br.readLine();
				line.trim();
				
				String[] words = line.split("\\s");
				xa = Double.parseDouble(words[0]);
				ya = Double.parseDouble(words[1]);
				ra = Double.parseDouble(words[2]);
				xb = Double.parseDouble(words[3]);
				yb = Double.parseDouble(words[4]);
				rb = Double.parseDouble(words[5]);

				int ans = -1;
				double distance = Math.sqrt(Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2));
				
				if(distance > ra + rb) ans = 0;
				else if(ra > distance + rb) ans = 2;
				else if(rb > distance + ra) ans = -2;
				else ans = 1;
				System.out.println(ans);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}