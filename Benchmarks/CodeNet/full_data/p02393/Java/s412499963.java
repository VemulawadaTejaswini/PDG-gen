import java.io.*;

public class Menseki {
	public static void main(String[] args) {
		String line;
		int a,b,c;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("input a:");
			line = reader.readLine();
			a = Integer.parseInt(line);
			System.out.println("input b:");
			line = reader.readLine();
			b = Integer.parseInt(line);
			System.out.println("input c:");
			line = reader.readLine();
			c = Integer.parseInt(line);
			if(a>b && a>c && b>c) {
				System.out.println(c+" "+b+" "+a);
			}else if(a>b && a>c && b<c){
				System.out.println(b+" "+c+" "+a);
			}else if(b>a && b>c && a>c){
				System.out.println(c+" "+a+" "+b);
			}else if(b>a && b>c && c>a){
				System.out.println(a+" "+c+" "+b);
			}else if(c>a && c>b && a>b){
				System.out.println(a+" "+b+" "+c);
			}else if(c>a && c>b && b>a){
				System.out.println(b+" "+a+" "+c);
			}
		}catch(NumberFormatException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
