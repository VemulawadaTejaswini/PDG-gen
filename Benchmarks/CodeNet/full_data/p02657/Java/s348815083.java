import java.io.*;
public class Main{
	public static void main(String args[]) throws IOException{
     	BufferedReader in=new BufferedReader(new InputStreamreader(System.in));
      	StringTokenizer st=new StringTokenizer(in.readLine());
      	int a=Integer.parseInt(st.nextToken());
      	int b=Integer.parseInt(st.nextToken());
      	System.out.println(a*b);
    }
}