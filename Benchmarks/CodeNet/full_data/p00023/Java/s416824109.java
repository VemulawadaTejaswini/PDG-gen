import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] a){

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String tmpString = null;
		int dataset = 0;

		try {
			if(null != (tmpString = bf.readLine())){
				dataset = Integer.parseInt(tmpString);
			}

			for(int i = 0; i < dataset; i++){
				if(null != (tmpString = bf.readLine())){
					double[] numbers = convert(tmpString);
					double distance = Math.sqrt(Math.pow(numbers[0] - numbers[3], 2) + Math.pow(numbers[1] - numbers[4], 2));
					if(numbers[2] + numbers[5] < distance){
						System.out.println("0");
					} else if(distance > numbers[2] && distance + numbers[2] < numbers[5]){
						System.out.println("-2");
					} else if(distance > numbers[5] && distance + numbers[5] < numbers[2]){
						System.out.println("2");
					} else {
						System.out.println("1");
					}
				}
			}
		} catch (IOException e) {
		}
	}


	private static double[] convert(String strings){
		String[] tmp = strings.split(" ");
		int count = tmp.length;
		double[] retval = new double[count];
		for(int i = 0; i < count; i++){
			retval[i] = Double.parseDouble(tmp[i]);
		}
		return retval;
	}
}