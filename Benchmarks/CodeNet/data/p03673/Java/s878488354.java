import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		
		//数列の長さ
		int n=sc.nextInt();
		int[] afterNumber=new int[n];
		int[] beforeNumber=new int[n*2];
		Arrays.fill(beforeNumber,(int)Math.pow(10,10));
		
		//数列
		for(int i=1;i<=n;i++) {
			afterNumber[i-1]=sc.nextInt();
			if(n%2==0) {
				if(i%2==0) {
					beforeNumber[n-i]=afterNumber[i-1];
				}else {
					beforeNumber[n+i]=afterNumber[i-1];
				
				}
			}else {
				if(i%2==0) {
					beforeNumber[n+i]=afterNumber[i-1];
				}else {
					beforeNumber[n-i]=afterNumber[i-1];

				}
			}
		}

		for(int i=0;i<beforeNumber.length;i++) {
			if(beforeNumber[i]!=(int)Math.pow(10,10)) {
			System.out.print(beforeNumber[i]+" ");
			}
		}
	}
}