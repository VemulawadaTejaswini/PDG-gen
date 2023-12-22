import java.io.*;

 public class Main{
	 public static void main(String args[]) throws IOException{
		 BufferedReader bf = new BufferedReader(
				 new InputStreamReader(System.in));
		 double radian,r,x = 0,y = 0;
		 int t = 90;
		 String str;
		 while(true){
			 str = bf.readLine();
			 if(str.equals("0,0")) break;
			 String[] deta = str.split(",",0);
			 r = Integer.parseInt(deta[0]);
			 radian = t*Math.PI/180d;
			 t += -Integer.parseInt(deta[1]);
			 x += r*Math.cos(radian);
			 y += r*Math.sin(radian);
		 }
		 System.out.println((int)x);
		 System.out.println((int)y);

	 }
}