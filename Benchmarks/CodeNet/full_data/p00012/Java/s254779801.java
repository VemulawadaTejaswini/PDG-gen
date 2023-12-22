import java.io.*;
class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br
		= new BufferedReader(new InputStreamReader(System.in));
		while(true){

			String buf;
			buf=br.readLine();
			String[] buf2=buf.split(" ");
			double[] data=new double[8];
			for(int i=0;i<data.length;i++){
				data[i]=Double.parseDouble(buf2[i]);
			}
			if(suppose(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7])){
				System.out.println("YES");
			}else{
				System.out.println("NO");
				break;
			}
		}
	}
	private static boolean suppose(double x1,double y1,double x2,double y2,double x3,double y3,double xp,double yp){
		double a1=((y1-y2)/(x1-x2)),b1=y1-a1*x1;
		double a2=((y2-y3)/(x2-x3)),b2=y2-a1*x2;
		double a3=((y3-y1)/(x3-x1)),b3=y3-a1*x3;
		if (
				(yp < (a1*xp+b1) ) && (yp > (a2*xp+b2) ) && (yp > (a3*xp+b3) ) ||
				(yp > (a1*xp+b1) ) && (yp < (a2*xp+b2) ) && (yp > (a3*xp+b3) ) ||
				(yp > (a1*xp+b1) ) && (yp > (a2*xp+b2) ) && (yp < (a3*xp+b3) )
				)
			return true;

		return false;
	}
}