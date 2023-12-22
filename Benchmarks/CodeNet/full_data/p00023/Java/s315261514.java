import java.io.*;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Double data[] = new Double[6];
		String str;
		int result[] = new int[N];
		for(int i = 0; i < N; i++){
			str = br.readLine();
			String predata[] = str.split(" ",0);
			for(int j = 0; j < predata.length; j++){
				data[j] = Double.parseDouble(predata[j]);
			}
			double d = Math.sqrt(((data[0]-data[3])*(data[0]-data[3]))+((data[1]-data[4])*(data[1]-data[4])));
			if(d > data[2]+data[5]){
				result[i] = 0;
			} else {
				if(data[2] < data[5]){
					if(d + data[2] < data[5]){
						result[i] = -2;
					} else {
						result[i] = 1;
					}
				}
				if(data[2] > data[5]){
					if(d + data[5] < data[2]){
						result[i] = 2;
					} else {
						result[i] = 1;	
					}
				}
			}
		}
		for(int i = 0; i < N; i++){
			System.out.println(result[i]);
		}
	}
}