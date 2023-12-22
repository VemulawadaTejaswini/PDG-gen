import java.io.*;

public class Main {
	public static void main(String[] a) {
	try{	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String str = br.readLine();
	    String[] strAry = str.split(" ");
			
	    int in1 = Integer.parseInt(strAry[0]);
	    int in2 = Integer.parseInt(strAry[1]);
	    
		int x = RectArea(in1, in2);
		int y = Circumference(in1, in2);
		
		System.out.println(x + " " + y);
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static int  RectArea(int a, int b){
		return a * b;
	} 
	public static int Circumference(int a, int b){
		return (2 *a) + (2 * b);
	}

}