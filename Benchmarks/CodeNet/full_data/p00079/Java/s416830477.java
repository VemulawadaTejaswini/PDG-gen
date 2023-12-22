import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String args[])throws IOException{
		Path2D.Double path = new Path2D.Double();;
		Point2D.Double[] p = new Point2D.Double[20];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] splitLine = new String[2];
		int count=0;
		double a,b,c,z;
		double sum=0;
		
		for(int i=0;i<20;i++){
			p[i] = new Point2D.Double();
		}
		
		while(true){
			line = br.readLine();
			if(line == null || line.isEmpty())
				break;
			splitLine = line.split(",");
			p[count].setLocation(Double.parseDouble(splitLine[0]),Double.parseDouble(splitLine[1]));
			count++;
		}
		
		for(int i=0;i<count-2;i++){
			a=p[0].distance(p[i+1]);
			b=p[i+1].distance(p[i+2]);
			c=p[i+2].distance(p[0]);
			z=(a+b+c)/2;
			sum+=Math.sqrt(z*((z-a)*(z-b)*(z-c)));
		}
		
		System.out.printf("%.6f\n",sum);
	}
}