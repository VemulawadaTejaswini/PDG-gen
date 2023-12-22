import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			long[] e = new long[n];
			long[] o = new long[n*(n-1)/2];
			for(int i=0;i<n;i++){
				e[i]=sc.nextLong();
			}
			for(int i=0;i<o.length;i++){
				o[i]=sc.nextLong();
			}
			Arrays.sort(e);
			Arrays.sort(o);
			if(o[0]==0){
//				System.out.println("jpoirwajtpoia");
//				continue;
			}
			
			BigInteger bi=new BigInteger(""+e[0]);
			bi=bi.multiply(new BigInteger(""+e[1]));
			bi=bi.divide(new BigInteger(""+o[0]));
			long E = (long)Math.sqrt(Long.parseLong(bi.toString())); 
//			long E = (long)Math.sqrt((e[0]*e[1])/o[0]);
			System.out.println(E);
			for(int i=0;i<e.length;i++){
				if(E==0){
//					System.out.println("jpoirwajtpoia");
//					break;
				}
				System.out.print(e[i]/E);
				if(i!=e.length-1)System.out.print(" ");
			}
			System.out.println();
		}
	}
}