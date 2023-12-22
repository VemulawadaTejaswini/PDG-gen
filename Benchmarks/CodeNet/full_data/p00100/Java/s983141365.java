import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int N=cin.nextInt();
			if(N==0){
				break;
			}
			BigInteger[] a = new BigInteger[4001];
			for(int i = 0; i < a.length;i++){
				a[i]=new BigInteger("0");
			}
			long max=-1;
			for(int i = 0; i <N;i++){
				int sha = cin.nextInt();
				long tan = cin.nextInt();
				long suu = cin.nextInt();
				a[sha]=a[sha].add(new BigInteger(tan*suu +""));
			}
			boolean f = false;
			for(int i = 1;i<=4000;i++){
				if(a[i].compareTo(new BigInteger("1000000"))>=0){
					System.out.println(i);
					f=true;
				}
			}
			if(!f){
				System.out.println("NA");
			}
		}

	}

}