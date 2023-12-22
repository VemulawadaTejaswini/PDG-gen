import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
 	String str = br.readLine();
	String[] line = str.readLine().split(" ");

	int a = Integer.parseInt(line[0]);
	int b = Integer.parseInt(line[1]);
	int c = Integer.parseInt(line[2]);

	if( a < b && b < c){
		System.out.println("Yes");
	}
	
	else{
		System.out.println("No");
	}

}
}