import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	
	static Main byakko = new Main();
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args)throws IOException{
		
		int n = byakko.Input();
		double x,y,x1,y1,x2,y2,x3,y3,dx,dy;
		
		for(int i = 0; i < n; i++){
			String[] code = byakko.InputX().split(" ");
			x  = Double.parseDouble(code[0]);
			y  = Double.parseDouble(code[1]);
			x1 = Double.parseDouble(code[2]);
			y1 = Double.parseDouble(code[3]);
			x2 = Double.parseDouble(code[4]);
			y2 = Double.parseDouble(code[5]);
			x3 = Double.parseDouble(code[6]);
			y3 = Double.parseDouble(code[7]);
			
			dx = (x1 - x) * (y3 - y2);
			dy = (x3 - x2) * (y1 - y);
			dx = dx - dy;
			
			if(dx == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		reader.close();
	}
	
	public int Input()throws IOException{
		return Integer.parseInt(reader.readLine());
	}
	public String InputX()throws IOException{
		return reader.readLine();
	}
	
}