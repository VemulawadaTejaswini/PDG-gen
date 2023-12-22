import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		double[] x = new double[n];
		double[] y = new double[n];
		String[] line = new String[n];
		double dxyP1=0;
		double dxyP2=0;
		double dxyP3=0;
		double dxyP=0;
	//input x
		line=sc.nextLine().split(" ");
		for(int i=0;i<n;i++)){
			x[i]=Double.parseDouble(line[i]);
		}
	//input y	
		line=sc.nextLine().split(" ");
		for(int i=0;i<n;i++){
			x[i]=Double.parseDouble(line[i]);
		}
	//dxy		
		for(int i=0;i<n;i++){
			dxyP1+=Math.abs(x[i]-y[i]);
			dxyP2+=dxyP1*dxyP1;
			dxyP3+=dxyP1*dxyP1*dxyP1;
			if(dxyP<dxyP1){
				dxyP=dxyP1;
			}
		}
		dxyP2=Math.sqrt(dxyP2);
		dxyP3=Math.cbrt(dxyP3);
	//output	
		System.out.printf("%.6f",dxyP1);
		System.out.println();
		System.out.printf("%.6f",dxyP2);
		System.out.println();
		System.out.printf("%.6f",dxyP3);
		System.out.println();
		System.out.printf("%.6f",dxyP);
		System.out.println();
	}
}