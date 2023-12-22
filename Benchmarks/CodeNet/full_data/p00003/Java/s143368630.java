import java.io.*;

public class Main{
	public static int findMax(int line0, int line1, int line2){
		int max;
		int num;
		if(line0 >= line1){
			max = line0;
			num = 0;
		}else{
			max = line1;
			num = 1;
		}
		
		if(max < line2){
			max = line2;
			num = 2;
		}
		return num;
	}
	
	public static void main(String[] argv) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int lineNum = Integer.parseInt(br.readLine());
		for(int i=0; i<lineNum; i++){
			String[] line = br.readLine().split(" ");
			int max = findMax(Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2]));
			int[] lineInt = {Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2])};
			int sum = 0;
			for(int j=0; j<3; j++){
				if(j != max){
					sum += (lineInt[j] * lineInt[j]);
				}
			}
			String out;
			if((lineInt[max] * lineInt[max]) == sum){
				out = "YES";
			}else{
				out = "NO";
			}
			System.out.print(out+"\n");
		}
	}
}