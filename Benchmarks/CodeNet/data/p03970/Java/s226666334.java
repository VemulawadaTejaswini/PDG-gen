import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] first = br.readLine().split(" ");
		int w = Integer.valueOf(first[0]);
		int h = Integer.valueOf(first[1]);
		int[] xArray = new int[w];
		int[] yArray = new int[h];
		int xSum=0;
		int ySum=0;
		long result =0;
		for(int i=0;i<w;i++){
			xArray[i] = Integer.valueOf(br.readLine());
			xSum += xArray[i];
		}
		for(int i=0;i<h;i++){
			yArray[i] = Integer.valueOf(br.readLine());
			ySum += yArray[i];
		}
		for(int i=1;i<=w;i++){
			for(int j=1;j<=h;j++){
				result += min(xArray[i-1],yArray[j-1]);
			}

		}
		System.out.println(result+xSum+ySum);




	}

	private static int min(int i, int j) {
		return i < j ? i : j;
	}

}
