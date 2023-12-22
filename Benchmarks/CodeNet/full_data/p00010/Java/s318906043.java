
import java.math.BigDecimal;
import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		int n=sc.nextInt();
		for(int c=0;c<n;c++){
			double[] x=new double[3],y=new double[3];
			x[0]=sc.nextDouble();
			y[0]=sc.nextDouble();
			x[1]=sc.nextDouble();
			y[1]=sc.nextDouble();
			x[2]=sc.nextDouble();
			y[2]=sc.nextDouble();
			double[] center=
			getSol(new double[]{
				x[2]-x[1]
				,y[2]-y[1]
				,(x[2]*x[2]+y[2]*y[2]-x[1]*x[1]-y[1]*y[1])/2					
			},new double[]{
				x[2]-x[0]
				,y[2]-y[0]
				,(x[2]*x[2]+y[2]*y[2]-x[0]*x[0]-y[0]*y[0])/2					
			});
			double r=Math.sqrt(
				(center[0]-x[0])*(center[0]-x[0])+
				(center[1]-y[0])*(center[1]-y[0]));
			ln(String.format("%.3f %.3f %.3f",center[0],center[1],r));
		}
	}
	public static double[] getSol(double[] f1,double[] f2){
		return new double[]{
			(f1[2]*f2[1]-f1[1]*f2[2])/(f1[0]*f2[1]-f1[1]*f2[0]),
			(f1[2]*f2[0]-f1[0]*f2[2])/(f1[1]*f2[0]-f1[0]*f2[1])
		};
	}
	
	public static String join(double[] array, String separator) {
		StringBuilder str = new StringBuilder(array[0] + "");
		for (int i = 1; i < array.length; i++) {
			str.append(separator).append(array[i] + "");
		}
		return str.toString();
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}