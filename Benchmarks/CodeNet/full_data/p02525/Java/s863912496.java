import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] linearr;
		int num;//?????°
		int[] scores;
		int i, l;
		int sum = 0;
		double ave;
		double alp;
		String result;
		try{
			while((line=reader.readLine()) != null){
				num = Integer.parseInt(line);
				if(num==0)return;
				sum = 0;
				alp = 0;
				ave = 0;
				line = reader.readLine();
				linearr = line.split(" ");
				l=linearr.length;
				scores = new int[l];
				for(i=0; i<l; i++){
					scores[i] = Integer.parseInt(linearr[i]);
					sum += scores[i];
				}
				ave = sum/num;
				for(i=0;i<l;i++){
					alp += (scores[i] - ave)*(scores[i] - ave);
				}
				alp = Math.sqrt((alp/num));
				result = String.format("%.8f", alp);
				System.out.println(result);
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}