import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int nn = sc.nextInt();
		double[] xx = new double[nn];
		double[] yy = new double[nn];
		double sum = 0;
		
		for (int i=0;i<nn;i++){
			xx[i] = sc.nextLong();
			yy[i] = sc.nextLong();
		}
		
		for(int s=0;s<nn;s++){
			for(int t=s+1;t<nn;t++){
				sum += (double)Math.sqrt(Math.pow(xx[s]-xx[t],2)+Math.pow(yy[s]-yy[t],2));
			}
		}
		
		sum = sum * 2 / nn ;
		
		System.out.print(sum);
				
	}
}