import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);

		for(int i=0; i<n; i++){
			int c=0;
			double x[] = new double[2];
			double y[] = new double[2];
			double r[] = new double[2];
			String strArray[] = br.readLine().split(" ");

			for(int j=0; j<2; j++){
				x[j] = Double.parseDouble(strArray[c]);
				y[j] = Double.parseDouble(strArray[c+1]);
				r[j] = Double.parseDouble(strArray[c+2]);
				c += 3;
			}
			Judge(x,y,r);
		}
	}

	static void Judge(double x[], double y[], double r[]){
		double d = Math.sqrt(Math.pow(x[0]-x[1], 2) + Math.pow(y[0]-y[1], 2));

		if(r[0]+r[1]<d){
			System.out.println(0);
		}else if(Math.abs(r[0]-r[1]) <= d && d <= r[0]+r[1]){
			System.out.println(1);
		}else if(d < Math.abs(r[0]-r[1])){
			System.out.println(r[0]>r[1] ? 2 :-2);
		}

	}
}