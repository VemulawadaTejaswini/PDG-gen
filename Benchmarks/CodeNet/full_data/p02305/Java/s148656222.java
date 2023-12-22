import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class week01_A {
	public static void main(String args[]) throws IOException{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

		double cx1, cy1, r1;
		double cx2, cy2, r2;
		
		//if(args.length != 0){
			cx1 = Double.valueOf(buffer.read());
			cy1 = Double.valueOf(buffer.read());
			r1 = Double.valueOf(buffer.read());
			cx2 = Double.valueOf(buffer.read());
			cy2 = Double.valueOf(buffer.read());
			r2 = Double.valueOf(buffer.read());
			
			double l = (Math.pow(cx1 - cx2, 2) + Math.pow(cy1 - cy2, 2));
			double rlen = r1+r2;
			double revlen = r1 - r2;
			if(l > rlen*rlen) 
				System.out.println("4");
			else if(l == rlen*rlen) 
				System.out.println("3");
			else if(l < rlen*rlen) {
				if(l > revlen*revlen)
					System.out.println("2");
				else if(l == revlen*revlen)
					System.out.println("1");
				else if(l < revlen*revlen)
					System.out.println("0");
			}
		//}
		//else System.out.println("Input doesn't be exist");
	}	
}


