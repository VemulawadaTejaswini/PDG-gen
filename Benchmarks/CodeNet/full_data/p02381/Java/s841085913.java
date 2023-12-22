import java.util.Arrays;
import java.util.Scanner;

public class Main{

	static final Scanner s=new Scanner(System.in);

	public static void main(String args[]){
		int n, in[];
		while((n=s.nextInt())!=0){
			in=new int[n];
			for(int i=0; i<n; i++)
				in[i]=s.nextInt();
			double ave=Arrays.stream(in).average().getAsDouble();
			System.err.println(ave);
			System.out.println(
					Math.sqrt(
							Arrays.stream(in)
									.mapToDouble(
											i->(i-ave)*(i-ave))
									.sum()
							/n
							)
					);
		}
	}
}