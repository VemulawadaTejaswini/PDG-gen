import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

//		 int n = Integer.parseInt(in.readLine());
		
		 String[] xy = in.readLine().split(" ");

		 int x=Integer.parseInt(xy[0]);
		 int y=Integer.parseInt(xy[1]);
		 
		 System.out.print(2);

		 
		 int tmp;
		 while(x==0){
			 
			 tmp=x%y;
			 y=x;
			 x=tmp;
			 
		 }
		 
//		 System.out.print(y);
		
	}
}