import java.io.*;

class Main {
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int n = Integer.parseInt(br.readLine());
			if(n == 0)break;
			double m = 0,sig = 0;
			String[] div = br.readLine().split(" ");
			for(int i=0; i<n; i++){
				double s = Double.parseDouble(div[i]);
				m += s;
			}
			m = m / n;
			for(int i=0; i<n; i++){
				double s = Double.parseDouble(div[i]);
				sig +=(s-m)*(s-m);
			}
			System.out.println(Math.sqrt(sig/n));
		}
	}
}