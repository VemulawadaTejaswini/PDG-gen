import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		while(in.hasNextDouble()){
			double[] x=new double[4],y=new double[4];
			for(int i=0;i<4;i++){
				x[i]=in.nextDouble();y[i]=in.nextDouble();
			}
			for(int i=0;i<3;i++){
				int a=i,b=(i+1)%3,c=(i+2)%3;
				double sa=((x[a]-x[b])*(y[c]-y[a])+(y[a]-y[b])*(x[a]-x[c]))*((x[a]-x[b])*(y[3]-y[a])+(y[a]-y[b])*(x[a]-x[3]));
				double sb=((x[c]-x[3])*(y[a]-y[c])+(y[c]-y[3])*(x[c]-x[a]))*((x[c]-x[3])*(y[b]-y[c])+(y[c]-y[3])*(x[c]-x[b]));
				if(sa<0.0 && sb<0.0){System.out.println("NO");break;}
				if(i==2)System.out.println("YES");
			}
		}
	}
}