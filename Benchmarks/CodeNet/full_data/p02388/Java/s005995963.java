import  java.io.*;
public class Main {

    public static void main(String[] args) throws IOException{
	int x;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	x = Integer.parseInt(br.readLine());
	x = x*x*x;
    System.out.println(x);
    }
}