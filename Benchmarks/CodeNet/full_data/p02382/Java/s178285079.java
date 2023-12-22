import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		int n = Integer.parseInt(std.next());
		double vector_a[] = new double[n];
		for (int i=0; i<n; i++){
			vector_a[i] =  Double.parseDouble(std.next());
		}
		double vector_b[] = new double[n];
		for (int i=0; i<n; i++){
			vector_b[i] =  Double.parseDouble(std.next());
		}

		double dim1 = 0;
		for (int i=0; i<n; i++){
			dim1 += Math.abs(vector_a[i]-vector_b[i]);
		}

		double dim2 = 0;
		for (int i=0; i<n; i++){
			dim2 += Math.pow(Math.abs(vector_a[i]-vector_b[i]),2);
		}
		dim2 = Math.pow(dim2, 0.5);

		double dim3 = 0;
		for (int i=0; i<n; i++){
			dim3 += Math.pow(Math.abs(vector_a[i]-vector_b[i]),3);
		}
		dim3 = Math.pow(dim3, (1/3.0));

		double diminf = 0;
		for (int i=0; i<n; i++){
			diminf = Math.max(Math.abs(vector_a[i]-vector_b[i]),diminf);
		}

		System.out.println(String.format("%.5f", dim1));
		System.out.println(String.format("%.5f", dim2));
		System.out.println(String.format("%.5f", dim3));
		System.out.println(String.format("%.5f", diminf));
	}
}