import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0; i<n; i++) {
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			String s="";
			int num1=100000010,num2=100000010, num3=100000010;
			for(int i=0; i<4; i++) {
				for(int j=0; j<4; j++) {
					if(i==j) continue;
					s=String.valueOf(a[i])+String.valueOf(a[j]);
					int k=Integer.parseInt(s);
					if(num1>k) {
						num3=num2;
						num2=num1;
						num1=k;
					}else if(num2>k) {
						num3=num2;
						num2=k;
					}else if(num3>k){
						num3=k;
					}
				}
			}
			System.out.println(num3);

		}
	}
}
