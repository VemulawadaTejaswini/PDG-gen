import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		int i=0;
		double yokin=100;
		
		while(yokin<x) {
			yokin=yokin*1.01;
			yokin=Math.floor(yokin);
			
			i++;
		}
		System.out.println(i);
		
		sc.close();
	}

}