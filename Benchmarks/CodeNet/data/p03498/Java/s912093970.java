import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger[] a=new BigInteger[n];
		BigInteger maxAbs=BigInteger.ZERO;
		int argMaxAbs=0;
		for (int i=0;i<n;i++) {
			a[i]=BigInteger.valueOf(sc.nextInt());
			if(a[i].abs().compareTo(maxAbs) > 0) {
				maxAbs=a[i].abs();
				argMaxAbs=i;
			}
		}
		int count=0;
		int[] first=new int[2*n];
		int[] second=new int[2*n];
		if(a[argMaxAbs].compareTo(BigInteger.ZERO) > 0) {
			for (int i=0;i<n-1;i++) {
				for(int j=0;j<2;j++) {
					first[count]=argMaxAbs+1;
					second[count]=i+2;
					count++;
					a[i+1]=a[i+1].add(a[argMaxAbs]);
					
					if(a[i+1].abs().compareTo(maxAbs) > 0) {
						maxAbs=a[i+1].abs();
						argMaxAbs=i+1;
					}		

				}
				

			}
		}
		else if (a[argMaxAbs].compareTo(BigInteger.ZERO) < 0){
			for (int i=n-1;i>0;i--) {
				
		
				for(int j=0;j<2;j++) {
					first[count]=argMaxAbs+1;
					second[count]=i;
					count++;
					a[i-1]=a[i-1].add(a[argMaxAbs]);
					
					if(a[i-1].abs().compareTo(maxAbs) > 0) {
						maxAbs=a[i-1].abs();
						argMaxAbs=i-1;
					}	

				}

			}
		}
		System.out.println(count);
		for(int i=0;i<count;i++) {
			System.out.println(first[i]+" "+second[i]);
		}
		
	//	System.out.println(Arrays.toString(a));
		
	}

}
