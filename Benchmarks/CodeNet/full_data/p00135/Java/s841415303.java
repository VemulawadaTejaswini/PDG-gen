import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		final double M_ADD = 360.0/60.0;
		final double H_ADD = M_ADD/12.0;
		final double alert = 30.0;
		final double safe = 90.0;
		
		//while(true){
			int n = Integer.parseInt(in.readLine());
			for(int i= 0; i < n;i++){
				String[] ss = in.readLine().split(":");
				double t = Double.parseDouble(ss[1]);
				double h = Double.parseDouble(ss[0]) * 60.0+ t;
				if(Math.abs(t*M_ADD-h*H_ADD) < alert){
					System.out.println("alert");
				}
				else if(Math.abs(t*M_ADD-h*H_ADD) > safe){
					System.out.println("safe");
				}
				else{
					System.out.println("warning");
				}
				
			}
		//}
		
	}
	

}