import java.io.*;

public class Main{
	public static long findGcd(long f1, long f2){
		long gcd = 1;
		long max, min;
		if(f1 > f2){max = f1; min = f2;}
		else{max = f2; min = f1;}
		for(long i=2; i<=(long)(Math.sqrt(max)+1); i++){
			if(min % i == 0){
				long tmp = min / i;
				if((max % tmp) == 0){
					gcd = tmp;
					break;
				}
			}
		}
		return gcd;
	}
	
	public static long findlcm(long f1, long f2){
		long lcm = 0;
		long max, min;
		if(f1 > f2){max = f1; min = f2;}
		else{max = f2; min = f1;}
		long i=1;
		while(lcm == 0){
			if((max * i)%min == 0){
				lcm = max * i;
			}
			i++;
		}
		return lcm;
	}
	
	public static void main(String[] argv) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = br.readLine()) != null){
			String[] lineArray = line.split(" ");
			long[] factor = {Long.parseLong(lineArray[0]), Integer.parseInt(lineArray[1])};
			long gcd = findGcd(factor[0], factor[1]);
			long lcm = findlcm(factor[0], factor[1]);
			System.out.printf("%d %d", gcd, lcm);
		}
	}
}