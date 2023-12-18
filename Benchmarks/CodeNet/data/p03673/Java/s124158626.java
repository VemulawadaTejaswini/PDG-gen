import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		
		//数列の長さ
		int n=sc.nextInt();
		int[] afterNumber=new int[n];
		ArrayList<Integer>beforeNumber=new ArrayList<>();
		
		//数列
		for(int i=1;i<=n;i++) {
			afterNumber[i-1]=sc.nextInt();
			if(n%2==0) {
				if(i%2==0) {
					beforeNumber.add(0,afterNumber[i-1]);
				}else {
					beforeNumber.add(afterNumber[i-1]);
				}
			}else {
				if(i%2==0) {
					beforeNumber.add(afterNumber[i-1]);
				}else {
					beforeNumber.add(0,afterNumber[i-1]);
				}
			}
		}

		for(int result:beforeNumber) {
			System.out.print(result+" ");
		}
	}
}
