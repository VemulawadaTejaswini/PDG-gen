import java.util.Scanner;
import java.lang.Math;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long[] A=new long[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextLong();
        }
		long result = 1;
		 for(int i=0;i<N;i++){
			 result *= A[i];
		 }
        long eighteen = (long)Math.pow(10,18);

		 if (result > eighteen)
		 {System.out.println("-1");}
	 else{System.out.println(result);}
		 
		
    }
}