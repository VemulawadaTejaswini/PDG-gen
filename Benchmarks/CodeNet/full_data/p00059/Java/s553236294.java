import java.awt.geom.Rectangle2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String str = br.readLine();
			
			if(str == null){
				break;
			}
			
			String[] tmpArray = str.split(" ");
			double[] input = new double[8];
			for(int i = 0; i < input.length ; i++){
				input[i] = Double.parseDouble(tmpArray[i]);
			}
			
			Rectangle2D.Double rect1 = new Rectangle2D.Double(input[0], input[3], input[2] - input[0], input[3] - input[1]);
			Rectangle2D.Double rect2 = new Rectangle2D.Double(input[4], input[7], input[6] - input[4], input[7] - input[5]);
			
			if(rect1.intersects(rect2)){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}

}