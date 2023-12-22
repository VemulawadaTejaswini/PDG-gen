import java.util.Scanner;


public class aoj0024 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int input1,input2;
		int h = 0;
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			input1 = sc.nextInt();
			input2 = sc.nextInt();
			int x = input1 + input2;
			
			for(ans = 1; ;ans++){
				if(x/10 == 0)break;
				x/=10;
			}
			
			System.out.println(ans);
			
		}

	}

}