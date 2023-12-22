import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(b.readLine());
		boolean[] r = new boolean[n];
		String s;
		char[] c;
		String[] data = new String[8]; //Correspond to x1,y1,x2,y2,x3,y3,x4,y4
		int count = 0;
		
		for(int i = 0;i < n;i++){
			s = b.readLine();
			c = s.toCharArray();
			for(int j = 0;j < 8;j++){
				data[j] = "";
			}
			for(int j = 0;j < c.length;j++){
				if(c[j] != ' '){
					data[count] += c[j];
				}
				else{
					count++;
				}
			}
			r[i] = true;

			if((Double.parseDouble(data[2])-Double.parseDouble(data[0]))/(Double.parseDouble(data[3])-Double.parseDouble(data[1])) == (Double.parseDouble(data[6])-Double.parseDouble(data[4]))/(Double.parseDouble(data[7])-Double.parseDouble(data[5]))){
				r[i] = true;
			}
			else{
				r[i] = false;
			}
		}

		for(int i = 0;i < n;i++){
			printResult(r[i]);
		}
	}

	static void printResult(boolean r){
		if(r){
			System.out.println("YES");
		}
		else{ 
			System.out.println("NO");
		}
	}
}