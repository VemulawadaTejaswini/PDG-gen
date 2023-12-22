import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int S;
		do{
			S = Integer.parseInt(br.readLine());
		}while(!(0 <= S && S < 86400));

		int h,m,s;
		h = m = s = 0;
		while(S >= 3600){
			S -= 3600;
			h++;
		}
		while(S >= 60){
			S -= 60;
			m++;
		}
		s = S;

		System.out.println(h + ":" + m + ":" + s);
	}
}