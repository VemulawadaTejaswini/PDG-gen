import java.util.Scanner;

public class FizzBuzzSum {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);

		//FizzBuzz列の項目数
		int N=sc.nextInt();
		long count=0;
		
		for(int i=0;i<N;i++) {
			if(i%3==0&&i%5==0) {			
//				System.out.println("FizzBuzz");
			}else if(i%3==0) {
//				System.out.println("Fizz");
			}else if(i%5==0) {
//			System.out.println("Buzz");
			}else {
//				System.out.println(i);
				count+=i;
			}
		}
		System.out.println(count);
	}

}
