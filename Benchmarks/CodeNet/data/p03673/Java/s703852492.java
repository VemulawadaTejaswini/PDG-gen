import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		
		//数列の長さ
		int n=sc.nextInt();
		int[] afterNumber=new int[n];
		ArrayList<Integer>beforeNumber=new ArrayList<Integer>();
		
		//数列
		for(int i=0;i<n;i++) {
			afterNumber[i]=sc.nextInt();
			beforeNumber.add(afterNumber[i]);
			Collections.reverse(beforeNumber);
		}

		
		for(int result:beforeNumber) {
			System.out.print(result+" ");
		}
	}
}