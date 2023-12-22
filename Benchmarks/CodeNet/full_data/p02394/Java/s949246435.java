import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String str = br.readLine();
	String[] line = str.split(" ");

	int a = Integer.parseInt(line[0]);
	int b = Integer.parseInt(line[1]);
	int c = Integer.parseInt(line[2]);
	int d = Integer.parseInt(line[3]);
	int e = Integer.parseInt(line[4]);
	
	if (c - e < 0 || c + e > 0){
	System.out.print("No");
	}

	else if ( c - e > 0 && c + e < a){
	System.out.print("Yes");
	}
	}
}