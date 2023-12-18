import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		String ans;

		if(a<=0){
			if(b >=0){
				ans = "Zero";
			}else{
				if((a+b)%2==0){
					ans = "Negative";
				}else{
					ans = "Positive";
				}
			}
		}else{
			ans ="Positive";
		}

		System.out.println(ans);

	}

}
