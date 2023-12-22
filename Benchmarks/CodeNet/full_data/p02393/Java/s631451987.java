import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String strArray[] = str.split(" ", 0);
		int num[] = new int[strArray.length];

		for(int i=0; i<strArray.length; i++){
			num[i] = Integer.parseInt(strArray[i]);
		}
		for(int s=0; s<num.length; s++){
			for(int t=s+1; t<num.length; t++){
				if(num[t] < num[s]){
					int tmp = num[t];
					num[t] = num[s];
					num[s] = tmp;
				}
			}
		}
		System.out.println(num[0] + " " + num[1] + " " + num[2]);
	}
}