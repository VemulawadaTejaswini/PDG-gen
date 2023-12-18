import java.util.Scanner;

class BinaryConversion {
	public static long[] decimalToBinary(long num) {
		long[] a=new long[60];
		int i=a.length-1;
		while(num!=0) {
			a[i]=num%2;
			num/=2;
			i--;
		}
		return a;
	}
	public static long binaryToDecimal(long[] a) {
		long num=0;
		for (int i = 0; i < a.length; i++) {
			num+=(a[i]*Math.pow(2, a.length-1-i));
		}
		return num;
	}
}

public class XOR {
	public static long[] xor(long num1,long num2) {
		long[] a=BinaryConversion.decimalToBinary(num1);
		long[] b=BinaryConversion.decimalToBinary(num2);
		for (int i = 0; i < a.length; i++) {
			a[i]=(a[i]+b[i])%2;
		}
		return a;
	}
}

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] num=new long[n];
        for(int i=0;i<n;i++) {
        	num[i]=sc.nextLong();
        }
        long sum=0;
        for (int i = 0; i < num.length-1; i++) {
			for (int j = i+1; j < num.length; j++) {
				long[] temp=XOR.xor(num[i], num[j]);
				sum+=BinaryConversion.binaryToDecimal(temp);
			}
		}
        sum%=(Math.pow(10, 9)+7);
        System.out.println(sum);
	}
}