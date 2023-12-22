import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] linearr;
		int w;
		int n;
		//int[] arr;
		String[][] exc;
		String str = "12345";
		int j,k;
		String _t;
		try{
			line = reader.readLine();
			w = Integer.parseInt(line);
			//arr = new int[w];
			line = reader.readLine();
			n = Integer.parseInt(line);
			//exc = new (int[2])[n];
			exc = new String[n][2];
			for(int i=0; i<n; i++){
				line = reader.readLine();
				linearr = line.split(",");
				exc[i][0] = linearr[0];
				exc[i][1] = linearr[1];
			}
			//??\????????????
			//???????????????
			for(int i=n-1; i>=0; i--){
				str = str.replace(exc[i][0], "*"+exc[i][0]);
				str = str.replace(exc[i][1], exc[i][0]);
				str = str.replace("*"+exc[i][0], exc[i][1]);
			}
			//??????
			for(int i=0; i<str.length(); i++){
				System.out.println(str.charAt(i));
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}