import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{

	BufferedReader br=
	    new BufferedReader(new InputStreamReader(System.in));
	String buf;
	buf=br.readLine();
	char[] data=buf.toCharArray();
	for(int i=(data.length-1);i>=0;i--){
	    System.out.print(data[i]);
	}
	System.out.println();
    }
}