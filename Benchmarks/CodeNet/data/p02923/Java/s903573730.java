import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		ArrayList<Integer>masu=new ArrayList<>(); 
		
		int count=0;
		int a=0;
		for(int i=0;i<n;i++) {
			masu.add(sc.nextInt());
		}
		
		for(int i=0;i<n-1;i++) {
			if(masu.get(i+1)<=masu.get(i)) {
				count++;
			}else {
				count=0;
			}
		}
		
		System.out.println(count);

	}

}
