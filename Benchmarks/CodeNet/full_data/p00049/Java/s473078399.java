//import java.util.Scanner;
import java.io.*;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		//Scanner scan = new Scanner(System.in);
		InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
		String t;
		int a = 0;
		int b = 0;
		int ab = 0;
		int o = 0;
		while((t = br.readLine()) != null){
			String[] k = t.split(",", 0);
			if(k[1].equals("A")){
				++a;
			}else if(k[1].equals("B")){
				++b;
			}else if(k[1].equals("AB")){
				++ab;
			}else{
				++o;
			}
		System.out.println(a + "\n" + b + "\n" + ab + "\n" + o);
		}
	}
}